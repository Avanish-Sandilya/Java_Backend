import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private final ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>(List.of(initialTransaction));
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        // return as List to avoid exposing internal ArrayList for modification
        return new ArrayList<>(transactions);
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', transactions=" + transactions + '}';
    }
}
