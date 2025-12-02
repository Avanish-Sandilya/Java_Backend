public class Product {

    String name;
    double price;
    int rating;

    Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " | ₹" + price + " | Rating: " + rating;
    }

}
