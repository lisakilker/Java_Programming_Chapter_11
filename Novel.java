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
public class Novel extends Story {

    public Novel() {
        super();
        setMinNumberOfPages();
    }

    public void setMinNumberOfPages() {
        minNumberOfPages = 101;
    }

    @Override
    public String setMessage() {
        if (numberOfPages < minNumberOfPages) {
            return ("You need to add " + (minNumberOfPages - numberOfPages) + " more pages for a Novel.");
        } else {
            return ("You have enough pages for a Novel.");
        }
    }
}
