import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> bookInventory=new Inventory<>(List.of(new Book("Effective Java"),new Book("Clean Code")));
        Inventory<Object> generalInventory = new Inventory<>();
        InventoryUtility.transferInventory(bookInventory,generalInventory);
        InventoryUtility.displayInventory(generalInventory);
        InventoryUtility.displayInventory(bookInventory);

    }
}
