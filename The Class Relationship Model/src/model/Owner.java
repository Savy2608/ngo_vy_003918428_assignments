package model;

public class Owner {
    private int ownerID;
    private String firstName;
    private String lastName;

    public Owner(int ownerID, String firstName, String lastName) {
        this.ownerID = ownerID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getOwnerID() { return ownerID; }
    public void setOwnerID(int ownerID) { this.ownerID = ownerID; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFullName() { return firstName + " " + lastName; }

    @Override
    public String toString() {
        return ownerID + " - " + getFullName();
    }
}