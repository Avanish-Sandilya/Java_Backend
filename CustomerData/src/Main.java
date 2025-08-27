public class Main {
    public static void main(String[] args) {
        CustomerData c1= new CustomerData();
        System.out.println(c1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        CustomerData c2= new CustomerData("Tim",100000,"timb@gmail.com");
        System.out.println(c2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        CustomerData c3 = new CustomerData(160000);
        System.out.println(c3);

    }
}
