import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
        this.customers=new ArrayList<Customer>();
    }

   public boolean newCustomer(String name,double transaction){
        for(var v:customers){
            if(findCustomer(name)){
                return false;
            }
        }
        customers.add(new Customer(name,transaction));
        return true;
   }

   public boolean addCustomerTransaction(String name,double transaction){
        for(var v:customers){
            if(findCustomer(name)){
                v.addTransaction(transaction);
                return true;
            }
        }
        return false;
   }

   private boolean findCustomer(String name){
        for(var v:customers){
            if(v.getName().equalsIgnoreCase(name)) return true;
        }
        return false;
   }

}
