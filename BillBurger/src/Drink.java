public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        setPrice();
    }

    private void setPrice(){
        this.price=this.size.equals("large")?20:(this.size.equals("medium")?15:10);
    }

    @Override
    public String toString() {
        return size + " " + type + " : $" + price;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
