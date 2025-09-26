public class Earphone extends ProductForSale{



    public Earphone(String type, String description, double price) {
        super(type, description, price);
    }


    @Override
    public void showDetails() {
        System.out.println("Product type: " + getType());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
    }
}
