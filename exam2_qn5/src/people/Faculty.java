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
public class Faculty extends Employee
{
    private String officeHours;
    private int numOfTeachingSub;

    public Faculty(String officeHours, int numOfTeachingSub, String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.numOfTeachingSub = numOfTeachingSub;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public int getNumOfTeachingSub() {
        return numOfTeachingSub;
    }
    @Override
    public String toString() {
        return "Faculty " +"\nName: "+super.getName();
    } 
}
