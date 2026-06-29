/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author anhnguyen
 */
public class FacultyDirectory {

    ArrayList<FacultyProfile> facultyList;

    public FacultyDirectory() {
        facultyList = new ArrayList();
    }

    public FacultyProfile newFacultyProfile(Person p) {

        FacultyProfile fp = new FacultyProfile(p);
        facultyList.add(fp);
        return fp;
    }

    public FacultyProfile findFacultyProfile(String id) {
        for (FacultyProfile fp : facultyList) {
            if (fp.isMatch(id)) {
                return fp;
            }
        }
        return null;// Not found after going through the whole list
    }

    public void removeFaculty(FacultyProfile fp) {
        facultyList.remove(fp);
    }

    public ArrayList<FacultyProfile> getFacultyList() {
        return facultyList;

    }

    

}
