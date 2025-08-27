public class CustomerData {
    private final String name;
    private final double creditLimit;
    private final String email;

    public CustomerData(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public CustomerData(){
        this("User",200000,"userMail@mailprovider.com");
    }

    public CustomerData(double creditLimit){
        this("User",creditLimit,"defaultmail@mailprovider.com");
    }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CustomerData{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }
}
