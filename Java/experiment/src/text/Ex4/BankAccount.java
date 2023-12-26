package text.Ex4;

public class BankAccount {
    public static final double rate = 0.0165;
    private String accountNumber;
    private String username;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private double balance;

    public BankAccount(String accountNumber, String username, double balance) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.balance = balance;
    }
    public void saveMoney(double amount) {
        balance += amount;
        System.out.println(this);
    }

    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        System.out.println(this);
    }

    public void checkBalance() {
        System.out.println(this);
    }

    public void addInterest(int year) {
        balance += balance * rate;
        System.out.println(this);
    }

    public String toString() {
        String report = accountNumber + "-" + username + ":" + balance + "\n";
        return report;
    }
}