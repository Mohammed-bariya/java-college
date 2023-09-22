class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(1000.0); // Initialize account with $1000

        myAccount.deposit(500.0);
        myAccount.withdrawal(200.0);
        myAccount.withdrawal(800.0);
        myAccount.deposit(1000.0);

        System.out.println("Current Balance: $" + myAccount.checkBalance());
    }
}
