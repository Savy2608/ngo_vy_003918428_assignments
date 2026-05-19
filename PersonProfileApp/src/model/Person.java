package model;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int    age;
    private final boolean married;
    private Address    homeAddress;
    private Address    localAddress;
    private BankAccount bankAccount;

    public Person(String firstName, String lastName, int age, boolean married) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
        this.married   = married;
    }

    public String  getFirstName()   { return firstName; }
    public String  getLastName()    { return lastName; }
    public int     getAge()         { return age; }
    public boolean isMarried()      { return married; }

    public Address    getHomeAddress()    { return homeAddress; }
    public Address    getLocalAddress()   { return localAddress; }
    public BankAccount getBankAccount()   { return bankAccount; }

    public void setHomeAddress(Address homeAddress)       { this.homeAddress = homeAddress; }
    public void setLocalAddress(Address localAddress)     { this.localAddress = localAddress; }
    public void setBankAccount(BankAccount bankAccount)   { this.bankAccount = bankAccount; }
}