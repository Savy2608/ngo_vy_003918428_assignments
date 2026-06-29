/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author kal bugrara
 */
public class Person {

    String id;
    String name;
    String nuid;
    String email;
    String phoneNumber;

    public Person(String id) {

        this.id = id;
        this.name = id; // default the display name to the id so pre-populated data still shows nicely
    }

    public String getPersonId() {
        return id;
    }

    public void setPersonId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNuid() {
        return nuid;
    }

    public void setNuid(String nuid) {
        this.nuid = nuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    

    public boolean isMatch(String id) {
        return getPersonId().equals(id);
    }
       
    @Override
    public String toString() {
        return name != null ? name : id;
    }
}
