import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderProcessingService {
    // CPU-bound executor (size ~= cores)
    private static final int CORES = Runtime.getRuntime().availableProcessors();
    private final ExecutorService cpuExecutor =
            Executors.newFixedThreadPool(CORES);

    // Thread-safe counter (single variable, no invariant)
    private final AtomicInteger processedOrders = new AtomicInteger(0);

    // Shared state with invariant → needs lock
    private final Object lock = new Object();
    private int totalRevenue = 0;

    // Entry point for submitting work
    public CompletableFuture<Void> processOrderAsync(int orderAmount) {

        return CompletableFuture
                .supplyAsync(() -> validateOrder(orderAmount), cpuExecutor)
                .thenApply(this::calculatePrice)
                .thenAccept(this::updateStateSafely);
    }

    // CPU-bound pure function (no locks needed)
    private int validateOrder(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid order");
        }
        return amount;
    }

    // Another pure computation
    private int calculatePrice(int amount) {
        return amount * 2;
    }

    // Minimal synchronized section → protects invariant
    private void updateStateSafely(int price) {
        synchronized (lock) {
            totalRevenue += price;
        }
        processedOrders.incrementAndGet();
    }

    // Safe read methods
    public int getProcessedOrders() {
        return processedOrders.get();
    }

    public int getTotalRevenue() {
        synchronized (lock) {
            return totalRevenue;
        }
    }

    // shutdown
    public void shutdown() {
        cpuExecutor.shutdown();
    }
}
