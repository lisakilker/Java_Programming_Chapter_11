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
public class Coordinator extends Employee{
    
    public double coordinatorPayRate = 20.00;

    public Coordinator() {
        super();
        setEmployeePayRate();
        setEmployeeJobTitle();
    }

    public void setEmployeePayRate() {
        if (employeePayRate <= coordinatorPayRate) {
            coordinatorPayRate = employeePayRate;
        } else {
            employeePayRate = coordinatorPayRate;
        }
    }

    public void setEmployeeJobTitle() {
        employeeJobTitle = "Coordinator";
    }
}
