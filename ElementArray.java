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
public class ElementArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DescribeElement[] element = new DescribeElement[4];

        element[0] = new MetalElement("Lithium", 3, 6.941);
        element[1] = new MetalElement("Sodium", 11, 22.98977);
        element[2] = new NonMetalElement("Hydrogen", 1, 1.007);
        element[3] = new NonMetalElement("Oxygen", 8, 15.999);

        for (int i = 0; i < element.length; i++) {
            System.out.println(element[i].describeElement());
        }
    }
}
