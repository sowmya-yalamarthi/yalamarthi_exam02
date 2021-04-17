/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Student extends Person 
{
    private String grade;
    private static final String classStatus="graduate";

    public Student(String grade, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public static String getClassStatus() {
        return classStatus;
    }

    @Override
    public String toString() {
        return "**************************\nStudent" + "\nName: "+super.getName()+"\n**************************";
    }    
}
