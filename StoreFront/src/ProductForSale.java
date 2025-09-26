public abstract class ProductForSale {

    private String type;
    private String description;
    private double price;


    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    public void printPricedItem(int quantity){
        System.out.printf("Product type: %s, quantity: %d, price: %s, total: %f\n",this.type,quantity,this.price,getSalesPrice(quantity));
    }

    public abstract void showDetails();


}
