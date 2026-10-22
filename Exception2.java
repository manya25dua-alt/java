
import java.util.Scanner;

class Insufficient extends Exception {
    Insufficient(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws Insufficient {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive"
            );
        }

        if (amount > balance) {
            throw new Insufficient("Insufficient balance");
        }

        balance = balance - amount;
        System.out.printf("Remaining balance: %.2f%n", balance);
    }
}

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        double amount = sc.nextDouble();

        BankAccount account = new BankAccount(balance);

        try {
            account.withdraw(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Insufficient e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
