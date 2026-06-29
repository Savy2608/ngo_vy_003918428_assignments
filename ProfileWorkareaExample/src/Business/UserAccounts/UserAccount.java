/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kal bugrara
 */
public class UserAccount {

    Profile profile;
    String username;
    String password;

    Date lastAccess; //last time the user logged in/ accessed  the app
    Date lastUpdated; //last time the account record was created or changed

    public UserAccount(Profile profile, String un, String pw) {
        username = un;
        password = pw;
        this.profile = profile;
        this.lastUpdated = new Date(); //account is created "now"

    }

    public String getPersonId() {
        return profile.getPerson().getPersonId();
    }

    public String getUserLoginName() {
        return username;
    }

    public void setUserLoginName(String username) {
        this.username = username;
        markUpdated();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public boolean IsValidUser(String un, String pw) {

        if (username.equalsIgnoreCase(un) && password.equals(pw)) {
            return true;
        } else {
            return false;
        }

    }

    public String getRole() {
        return profile.getRole();
    }

    public Profile getAssociatedPersonProfile() {
        return profile;
    }

    // access / update tracking
    public void recordAccess() {
        lastAccess = new Date();
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    // Convenience formatters for displaying in the UI tables / labels.
    public String getLastAccessText() {
        return format(lastAccess);
    }

    public String getLastUpdatedText() {
        return format(lastUpdated);
    }

    private String format(Date d) {
        if (d == null) {
            return "Never";
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
    }

    @Override
    public String toString() {

        return getUserLoginName();
    }

    private void markUpdated() {
        lastUpdated = new Date();
    }

}
