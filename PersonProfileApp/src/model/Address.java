package model;

public class Address {
    private final String ownerFirstName;
    private final String ownerLastName;
    private final String street;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String country;

    public Address(String ownerFirstName, String ownerLastName, String street,
                   String city, String state, String zipCode, String country) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String ownerFirstName() { return ownerFirstName; }
    public String ownerLastName() { return ownerLastName; }
    public String street() { return street; }
    public String city() { return city; }
    public String state() { return state; }
    public String zipCode() { return zipCode; }
    public String country() { return country; }
}
