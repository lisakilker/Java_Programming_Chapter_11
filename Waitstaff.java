/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W6HW;

/**
 *
 * @author Lisa
 */
public class Waitstaff extends Employee {

    public double waitstaffPayRate = 10.00;
    

    public Waitstaff() {
        super();
        setEmployeePayRate();
        setEmployeeJobTitle();
    }

    public void setEmployeePayRate() {
        if (employeePayRate <= waitstaffPayRate) {
            waitstaffPayRate = employeePayRate;
        } else {
            employeePayRate = waitstaffPayRate;
        }
    }

    public void setEmployeeJobTitle() {
        employeeJobTitle = "Waitstaff";
    }
}
