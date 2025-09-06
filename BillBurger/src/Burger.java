public class Burger {

    private String type;
    private double price;

    public Burger(String type) {
        this.type = type;
        setPrice();
    }

    private void setPrice(){
        this.price=this.type.equalsIgnoreCase("small")?2:(this.type.equalsIgnoreCase("medium")?2.5:3);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Burger: "+this.type+" "+"Price: "+this.price;
    }
}
