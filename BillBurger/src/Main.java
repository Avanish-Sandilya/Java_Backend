import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Default meal
        CreateMeal meal1 = new CreateMeal();
        System.out.println("Default meal:\n" + meal1);

        // 2. Meal with only Burger provided
        CreateMeal meal2 = new CreateMeal(new Burger("large"));
        System.out.println("\nMeal with only Burger:\n" + meal2);

        // 3. Meal with Burger + Drink
        CreateMeal meal3 = new CreateMeal(new Burger("medium"), new Drink("sprite", "large"));
        System.out.println("\nMeal with Burger + Drink:\n" + meal3);

        // 4. Meal with Burger + Drink + Side
        CreateMeal meal4 = new CreateMeal(new Burger("large"), new Drink("fanta", "medium"), new Side("salad"));
        System.out.println("\nMeal with Burger + Drink + Side:\n" + meal4);
        System.out.println("=============================================================");

        // 5. Meal with Burger + Drink + Side + custom Toppings
        List<Topping> customToppings = new ArrayList<>();
        customToppings.add(new Topping("cheese"));
        customToppings.add(new Topping("jalapeno"));
        customToppings.add(new Topping("bacon"));
        customToppings.add(new Topping("olives"));
        customToppings.add(new Topping("onion"));
        customToppings.add(new Topping("mushroom"));

        CreateMeal meal5 = new CreateMeal(new Burger("large"), new Drink("coke", "large"), new Side("fries"), customToppings);
        System.out.println("\nMeal with Burger + Drink + Side + Custom Toppings:\n" + meal5);
    }
}
