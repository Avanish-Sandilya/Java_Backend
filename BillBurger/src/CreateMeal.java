import java.util.ArrayList;
import java.util.List;

public class CreateMeal {

    private Burger burger;
    private Drink drink;
    private Side side;
    private List<Topping> toppingList;

    private static final int MAX_TOPPINGS = 5;

    public CreateMeal(Burger burger, Drink drink, Side side, List<Topping> toppings) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
        this.toppingList = new ArrayList<>();

        if (toppings.size() > MAX_TOPPINGS) {
            this.toppingList.addAll(toppings.subList(0, MAX_TOPPINGS)); // take only first 5
            System.out.println("Can only add upto 5 toppings");
        } else {
            this.toppingList.addAll(toppings);
        }
    }

    public CreateMeal(){
        this(new Burger("small"),new Drink("coke","small"),new Side("fries"),new ArrayList<>(List.of(new Topping("Cheese"))) );
    }

    public CreateMeal(Burger burger){
        this(burger,new Drink("coke","small"),new Side("fries"),new ArrayList<>(List.of(new Topping("Cheese"))));
    }

    public CreateMeal(Burger burger,Drink drink){
        this(burger,drink,new Side("fries"),new ArrayList<>(List.of(new Topping("Cheese"))));
    }

    public CreateMeal(Burger burger,Drink drink,Side side){
        this(burger,drink,side,new ArrayList<>(List.of(new Topping("Cheese"))));
    }

    @Override
    public String toString() {
        return "CreateMeal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", side=" + side +
                ", toppingList=" + toppingList +
                "Total=" + calculateTotalBill()+
                '}';
    }

    public double calculateTotalBill(){
        double toppingsTotal=0;

        for(var v:toppingList){
            toppingsTotal+=v.getPrice();
        }

        return burger.getPrice()+drink.getPrice()+side.getPrice()+toppingsTotal;
    }

}
