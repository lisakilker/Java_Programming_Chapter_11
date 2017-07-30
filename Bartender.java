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
public class Bartender extends Employee {
    
    public double bartenderPayRate = 14.00;

    public Bartender() {
        super();
        setEmployeePayRate();
        setEmployeeJobTitle();
    }

    public void setEmployeePayRate() {
        if (employeePayRate <= bartenderPayRate) {
            bartenderPayRate = employeePayRate;
        } else {
            employeePayRate = bartenderPayRate;
        }
    }

    public void setEmployeeJobTitle() {
        employeeJobTitle = "Bartender";
    }
}