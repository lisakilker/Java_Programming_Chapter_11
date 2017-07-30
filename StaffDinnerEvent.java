/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W6HW;

import W6HW.*;
import W6HW.*;
import java.util.Scanner;
import W6HW.Event;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Lisa
 */
public abstract class StaffDinnerEvent extends Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String eventNum;
        int guests, entree, side1, side2, dessert, waiters, bartenders, coordinators, count;
        Employee[] employee = new Employee[15];

        DinnerEvent[] dinnerEvents = new DinnerEvent[1];

        for (int x = 0; x < dinnerEvents.length; ++x) {
            System.out.println("***NEW EVENT***");
            eventNum = getEventNumber();
            guests = getGuests();
            entree = getEntree();
            side1 = getSides();
            side2 = getSides();
            dessert = getDessert();

            dinnerEvents[x] = new DinnerEvent(eventNum, guests, entree, side1, side2, dessert);
            dinnerEvents[x].setContactPhoneNumber(getContactPhone());
            
            waiters = guests / 10;
            for (count = 0; count < waiters; count++) 
                employee[count] = getWaitstaff();
            
            bartenders = guests / 25;
            for (count = 0; count < bartenders; count++) {
                employee[count] = getBartender();
            }

            coordinators = guests / guests;
            for (count = 0; count < coordinators; count++) {
                employee[count] = getCoordinator();
            }
            
                    dinnerEvents[x].setEmployee(employee);
                    
            displayEventDetails(dinnerEvents[x], count);
            
        }
    }

    public static String getEventNumber() {
        String num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the event number: ");
        num = input.nextLine();
        return num;
    }

    public static int getGuests() {
        int guests;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the amount of guests: ");
            guests = input.nextInt();
            input.nextLine();
        } while (guests < 5 || guests > 100);
        return guests;
    }

    public static String getContactPhone() {
        String phone;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your phone number? ");
        phone = input.nextLine();
        return phone;
    }

    public static int getEntree() {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Entree choices are: ");
        for (int j = 0; j < DinnerEvent.ENTREES.length; ++j) {
            System.out.println("    " + j + " " + DinnerEvent.ENTREES[j]);
        }
        System.out.print("What number entree would you like? ");
        num = input.nextInt();
        return num;
    }

    public static int getSides() {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Side dish choices are: ");
        for (int j = 0; j < DinnerEvent.SIDE_DISHES.length; ++j) {
            System.out.println("    " + j + " " + DinnerEvent.SIDE_DISHES[j]);
        }
        System.out.print("What side dish would you like? ");
        num = input.nextInt();
        return num;
    }

    public static int getDessert() {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Dessert choices are: ");
        for (int j = 0; j < DinnerEvent.DESSERTS.length; ++j) {
            System.out.println("    " + j + " " + DinnerEvent.DESSERTS[j]);
        }
        System.out.print("What dessert number would you like? ");
        num = input.nextInt();
        return num;
    }

    public static Waitstaff getWaitstaff() {
        Waitstaff waitstaff = new Waitstaff();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter waitstaff employee ID number: ");
        waitstaff.employeeID = input.nextLine();
        waitstaff.setEmployeeID(employeeID);
        System.out.println("Enter waitstaff employee first name: ");
        waitstaff.employeeFirstName = input.nextLine();
        waitstaff.setEmployeeFirstName(employeeFirstName);
        System.out.println("Enter waitstaff employee last name: ");
        waitstaff.employeeLastName = input.nextLine();
        waitstaff.setEmployeeLastName(employeeLastName);
        System.out.println("Enter waiter hourly pay rate: ");
        waitstaff.employeePayRate = input.nextDouble();
        waitstaff.setEmployeePayRate();
        waitstaff.setEmployeeJobTitle();
        return waitstaff;
    }

    public static Bartender getBartender() {
        Bartender bartender = new Bartender();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter bartender employee ID number: ");
        bartender.employeeID = input.nextLine();
        bartender.setEmployeeID(employeeID);
        System.out.println("Enter bartender employee first name: ");
        bartender.employeeFirstName = input.nextLine();
        bartender.setEmployeeFirstName(employeeFirstName);
        System.out.println("Enter bartender employee last name: ");
        bartender.employeeLastName = input.nextLine();
        bartender.setEmployeeLastName(employeeLastName);
        System.out.println("Enter bartender hourly pay rate: ");
        bartender.employeePayRate = input.nextDouble();
        bartender.setEmployeePayRate();
        bartender.setEmployeeJobTitle();
        return bartender;
    }

    public static Coordinator getCoordinator() {
        Coordinator coordinator = new Coordinator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coordinator employee ID number: ");
        coordinator.employeeID = input.nextLine();
        coordinator.setEmployeeID(employeeID);
        System.out.println("Enter coordinator employee first name: ");
        coordinator.employeeFirstName = input.nextLine();
        coordinator.setEmployeeID(employeeFirstName);
        System.out.println("Enter coordinator employee last name: ");
        coordinator.employeeLastName = input.nextLine();
        coordinator.setEmployeeID(employeeLastName);
        System.out.println("Enter coordinator hourly pay rate: ");
        coordinator.employeePayRate = input.nextDouble();
        coordinator.setEmployeePayRate();
        coordinator.setEmployeeJobTitle();
        return coordinator;
    }
    
    public static void displayEventDetails(DinnerEvent dinnerEvents, int count) {
        Employee[] employee = new Employee[15];
        employee = dinnerEvents.getEmployee();
        System.out.println();
        System.out.println("--EVENT DETAILS--");
        System.out.println("Event number is: " + dinnerEvents.getEventNumber());
        System.out.println("Number of guests is: " + dinnerEvents.getNumberOfGuests());
        System.out.println("Phone number is:  " + dinnerEvents.getContactPhone());
        System.out.println(dinnerEvents.getMenu());
        for (int i = 0; i < count; i++) 
            System.out.println("Your staff is: " + employee[i].getEmployeeID() + " "
                    + employee[i].getEmployeeFirstName() + " " + employee[i].getEmployeeLastName() + " "
                    + employee[i].getEmployeePayRate() + " " + employee[i].getEmployeeJobTitle());
        }

    }

