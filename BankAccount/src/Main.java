import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account= new Account();
        account.setAccountNumber("18ncret8776");
        account.setCustomerName("Ravi Sharma");
        account.setEmail("ravi.sharma986@gmail.com");
        account.setBalance(540000);
        account.setPhoneNumber("8654321009");

        System.out.println(account);

        account.deposit("11000");
        System.out.println(account.getBalance());
        account.withdraw("680000");
        account.withdraw("44000");
        System.out.println(account.getBalance());
    }
}
