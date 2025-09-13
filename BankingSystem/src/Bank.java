import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches=new ArrayList<>();
    }

    public boolean addBranch(String name){
        if(findBranch(name)){
            return false;
        }
        branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomer(String branchName,String customerName,double transaction){
        for(var v:branches){
            if(v.getName().equalsIgnoreCase(branchName)){
                if(!v.findCustomer(customerName)){
                    v.newCustomer(customerName,transaction);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,String customerName,double transaction){
        for(var v:branches){
            if(v.getName().equalsIgnoreCase(branchName)){
                if(v.findCustomer(customerName)){
                    v.addCustomerTransaction(customerName,transaction);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean listCustomers(String name,boolean printTransactions){
        if(printTransactions){
            for(var v:branches){
                if(v.getName().equalsIgnoreCase(name)){
                    System.out.println(v.getCustomers().toString());
                    return true;
                }
            }
        }else{
            for(var v:branches){
                if(v.getName().equalsIgnoreCase(name)){
                    System.out.println(v.toString());
                }
            }
        }

        return false;
    }

    private boolean findBranch(String name){
        for(var v:branches){
            if(v.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
