public class Side {
    private String type;
    private double price;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Side(String type) {
        this.type = type;
        setPrice();
    }

    private void setPrice(){
        this.price=this.type.equals("fries")?5:8;
    }

    @Override
    public String toString() {
        return "Side: "+this.type+" "+"Price: "+this.price;
    }
}
