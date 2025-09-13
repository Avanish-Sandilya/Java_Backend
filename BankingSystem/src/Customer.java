import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private ArrayList<Double>transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>(List.of(initialTransaction));
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }




    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
