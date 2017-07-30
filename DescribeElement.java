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
public abstract class DescribeElement {
    public String element;
    public int atomicNumber;
    public double atomicWeight;

public DescribeElement(String element, int atomicNumber, double atomicWeight){
    this.element = element;
    this.atomicNumber = atomicNumber;
    this.atomicWeight = atomicWeight;
}

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(double atomicWeight) {
        this.atomicWeight = atomicWeight;
    }
    
    public abstract String describeElement();
}
