public class Topping {

    private String type;
    private double price;

    public Topping(String type) {
        this.type = type;
        setPrice();
    }
    private void setPrice() {
        String toppingType = this.type.toLowerCase();
        switch (toppingType) {
            case "jalapeno" -> this.price = 0.10;
            case "cheese"   -> this.price = 0.50;
            case "olives"   -> this.price = 0.30;
            case "mushroom" -> this.price = 0.40;
            case "onion"    -> this.price = 0.20;
            default         -> this.price = 0.0;
        }
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Topping: "+this.type+" "+"Price: "+this.price;
    }
}
