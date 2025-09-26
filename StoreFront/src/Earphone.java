public class Earphone extends ProductForSale{

    private String type;
    private String desc;
    private double price;

    public Earphone(String type, String description, double price) {
        super(type, description, price);
    }


    @Override
    public void showDetails() {
        System.out.println("Product type: "+this.type+"\n"+"Description: "+this.desc+"\n"+"Price: "+this.price);
    }
}
