/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package Business;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;


/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");

// Create Persons
      PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person person001 = persondirectory.newPerson("John Smith");
        Person person002 = persondirectory.newPerson("Gina Montana");
        Person person003 = persondirectory.newPerson("Adam Rollen");
 
        Person person005 = persondirectory.newPerson("Jim Dellon");
        Person person006 = persondirectory.newPerson("Anna Shnider");
        Person person007 = persondirectory.newPerson("Laura Brown");
        Person person008 = persondirectory.newPerson("Jack While");
        Person person009 = persondirectory.newPerson("Fidelity"); //we use this as customer

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(person001);
        person001.setEmail("john.smith@northeastern.edu");
        person001.setPhoneNumber("617-555-0145");
        employeeprofile0.setTitle("Administrator");
        employeeprofile0.setDepartment("Information Systems");
        
        
 // Create students       
        StudentDirectory studentdirectory = business.getStudentDirectory();
        StudentProfile studentprofile0 = studentdirectory.newStudentProfile(person003);
        person003.setNuid("001234567");
        person003.setEmail("adam.rollen@northeastern.edu");
        

//A student that an admin has pre-registered by NUID but who does NOT yet
// have a user account. This person can complete the Sign-up page using the
// NUID 002345678 to create their account and then log in.

        Person pendingStudent = persondirectory.newPerson("002345678");
        pendingStudent.setNuid("002345678");
        pendingStudent.setName("");
        StudentProfile pendingStudentProfile = studentdirectory.newStudentProfile(pendingStudent);

// Create Faculty 
        FacultyDirectory facultydirectory = business.getFacultyDirectory();
        FacultyProfile facultyprofile0 = facultydirectory.newFacultyProfile(person007);
        person007.setEmail("laura.brown@northeastern.edu");
        person007.setPhoneNumber("617-543-0178");
        facultyprofile0.setTitle("Professor");
        facultyprofile0.setDepartment("Information Systems");

// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "****"); /// order products for one of the customers and performed by a sales person
        UserAccount ua4 = uadirectory.newUserAccount(studentprofile0, "adam", "****"); /// order products for one of the customers and performed by a sales person
        UserAccount ua5 = uadirectory.newUserAccount(facultyprofile0, "faculty", "****");  // faculty login
        return business;

    }

}
