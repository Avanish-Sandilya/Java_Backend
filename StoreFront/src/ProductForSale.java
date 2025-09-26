public abstract class ProductForSale {

    private final String type;
    private final String description;
    private final double price;


    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    public void printPricedItem(int quantity){
        System.out.printf("Product type: %s, quantity: %d, price: %s, total: %.2f\n",this.type,quantity,this.price,getSalesPrice(quantity));
    }

    public String getType() { return type; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }

    public abstract void showDetails();


}
