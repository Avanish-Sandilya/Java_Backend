public class Store {
    public static void main(String[] args) {
        Earphone earphone= new Earphone("electronics","Jabra evolve 65",19500);
        earphone.showDetails();
        earphone.getSalesPrice(2);
        earphone.printPricedItem(2);
    }
}
