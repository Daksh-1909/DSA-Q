class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountHolderName("Daksh");
        account.setAccountNumber(101);
        account.setBalance(5000.75);

        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}

// 5th prg