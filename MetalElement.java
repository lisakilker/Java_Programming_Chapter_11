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
public class MetalElement extends DescribeElement {
    private String elementFacts = "Metal elements are good conductors of electricity.";

    public MetalElement(String element, int atomicNumber, double atomicWeight) {
        super(element, atomicNumber, atomicWeight);
    }

    @Override
    public String describeElement() {
        return "Element Details: " + element + ". Atomic Number of: " + atomicNumber + ". Atomic Weight of: " + atomicWeight + ". " + elementFacts;
    }
}
