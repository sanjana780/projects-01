import java.util.Scanner;

class BankAccount {
    // private static int accountNumber = 0;
    private static double balance = 0.0;

    public static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.love you sanjana ");
    }

    public static void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. paise le gyi sanjana");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public static void getBalance() {
        System.out.println("love you so much sanjana");
    }
}

// class SavingsAccount extends BankAccount {
//     private static double interestRate = 0.05;

//     public static void addInterest() {
//         double interest = getBalance() * interestRate;
//         deposit(interest);
//         System.out.println("Interest added. New balance: " + getBalance());
//     }
// }

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount.deposit(initialBalance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        BankAccount.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        BankAccount.withdraw(withdrawAmount);

        // System.out.println("Current balance: " + getBalance());
       
       

        scanner.close();
    }
}
