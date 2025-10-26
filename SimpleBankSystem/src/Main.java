public class Main {
    public static void main(String[] args) {
        // Initialize bank with balances for 3 accounts
        long[] initialBalances = {1000, 2000, 3000};
        Bank bank = new Bank(initialBalances);

        // Perform some operations
        System.out.println("Initial Balances:");
        printBalances(initialBalances);

        System.out.println("\nDeposit 500 to Account 1:");
        System.out.println("Success: " + bank.deposit(1, 500));
        printBalances(bank.balance);

        System.out.println("\nWithdraw 1000 from Account 2:");
        System.out.println("Success: " + bank.withdraw(2, 1000));
        printBalances(bank.balance);

        System.out.println("\nTransfer 1500 from Account 3 to Account 1:");
        System.out.println("Success: " + bank.transfer(3, 1, 1500));
        printBalances(bank.balance);

        System.out.println("\nTry transferring 5000 from Account 1 to Account 2 (should fail):");
        System.out.println("Success: " + bank.transfer(1, 2, 5000));
        printBalances(bank.balance);
    }

    // Utility method to print balances
    public static void printBalances(long[] balances) {
        for (int i = 0; i < balances.length; i++) {
            System.out.println("Account " + (i + 1) + ": " + balances[i]);
        }
    }
}
