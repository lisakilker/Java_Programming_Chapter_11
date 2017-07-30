/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W6HW;

import java.util.Scanner;

/**
 *
 * @author Lisa
 */
public class UseInsurance extends Insurance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int typeChoice;

        Insurance[] insuranceArray = new Insurance[1];
        for (int i = 0; i < insuranceArray.length; i++) {

            Scanner input = new Scanner(System.in);

            System.out.println("What type of insurance would you like? 1 - Life, 2 - Health (type 0 to QUIT)");
            typeChoice = input.nextInt();

            if (typeChoice == 0) {
                System.exit(0);
            }
            if (typeChoice == 1) {
                insuranceArray[i] = new Life();
            }
            if (typeChoice == 2) {
                insuranceArray[i] = new Health();

            }
            System.out.println(insuranceArray[i].display());
        }
    }

    @Override
    public double setCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
