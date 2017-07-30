/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W6HW;

import W6HW.*;

/**
 *
 * @author Lisa
 */
public class DinnerEvent extends Event {

    int entree;
    int sideDish1;
    int sideDish2;
    int dessert;
    public static final String ENTREES[] = {"Steak", "Burger", "Pasta"};
    public static final String SIDE_DISHES[] = {"Fries", "Potatoes", "Green beans"};
    public static final String DESSERTS[] = {"Cupcake", "Cheesecake", "Ice cream"};
    Employee[] employee = new Employee[15];

    public DinnerEvent(String eventNum, int guestAmount, int anEntree, int sideDishOne, int sideDishTwo, int aDessert) {
        super(eventNum, guestAmount);
        this.entree = anEntree;
        this.sideDish1 = sideDishOne;
        this.sideDish2 = sideDishTwo;
        this.dessert = aDessert;
    }
    
    public Employee[] getEmployee(){
        return employee;
    }
    
    public void setEmployee(Employee[]employees){
        employee = employees;
    }

    public int getEntree() {
        return entree;
    }

    public int getSideDish1() {
        return sideDish1;
    }

    public int getSideDish2() {
        return sideDish2;
    }

    public int getDessert() {
        return dessert;
    }

    public void setEntree(int entree) {
        this.entree = entree;
    }

    public void setSideDish1(int sideDish1) {
        this.sideDish1 = sideDish1;
    }

    public void setSideDish2(int sideDish2) {
        this.sideDish2 = sideDish2;
    }

    public void setDessert(int dessert) {
        this.dessert = dessert;
    }

    public String getMenu() {
        String name = "You have selected --  Entree: " + ENTREES[entree]
                + "-- Side dish One: " + SIDE_DISHES[sideDish1]
                + "-- Side dish Two: " + SIDE_DISHES[sideDish2]
                + "-- Dessert: " + DESSERTS[dessert];
        return name;
    }
}


