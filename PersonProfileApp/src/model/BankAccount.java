package model;

public class BankAccount {
    private final String ownerFirstName;
    private final String ownerLastName;
    private final String accountNumber;
    private final String accountType;
    private final String bankName;
    private final double balance;

    public BankAccount(String ownerFirstName, String ownerLastName, String accountNumber,
                       String accountType, String bankName, double balance) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.bankName = bankName;
        this.balance = balance;
    }

    public String ownerFirstName() { return ownerFirstName; }
    public String ownerLastName() { return ownerLastName; }
    public String accountNumber() { return accountNumber; }
    public String accountType() { return accountType; }
    public String bankName() { return bankName; }
    public double balance() { return balance; }
}
