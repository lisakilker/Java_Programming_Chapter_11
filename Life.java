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
public class Life extends Insurance {
    
    public Life(){
        super();
        setMonthlyPrice();
        setType();
    }
    
    public void setType(){
        typeOfInsurance = "Life";
    }
    
    public void setMonthlyPrice(){
        monthlyPrice = 36.00;
    }

    @Override
    public double setCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String display() {
        return("You have selected: " + typeOfInsurance + ", which costs " + monthlyPrice + " per month.");
    }
    
}
