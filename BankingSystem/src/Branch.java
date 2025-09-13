import java.util.ArrayList;
import java.util.List;

public class Branch {
    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        // Return a copy to protect internal list
        return new ArrayList<>(customers);
    }

    public boolean newCustomer(String name, double transaction) {
        if (findCustomer(name) != null) {
            return false;
        }
        customers.add(new Customer(name, transaction));
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        List<String> names = new ArrayList<>();
        for (Customer c : customers) {
            names.add(c.getName());
        }
        return "Branch{name='" + name + "', customers=" + names + "}";
    }
}
