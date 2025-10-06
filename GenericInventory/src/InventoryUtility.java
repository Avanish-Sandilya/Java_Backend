public class InventoryUtility {

    public static void displayInventory(Inventory<?>inventory){
        inventory.printItems();
    }

    public static <T> void transferInventory(Inventory<? extends T> source, Inventory<? super T> destination) {
        for (T item : source.getItems()) {
            destination.addItem(item);
        }
    }

}
