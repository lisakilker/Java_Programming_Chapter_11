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
public class ShortStory extends Story {

    public ShortStory() {
        super();
        setMaxNumberOfPages();
    }

    public void setMaxNumberOfPages() {
        maxNumberOfPages = 49;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String setMessage() {
        if (numberOfPages > maxNumberOfPages) {

            return ("You need to remove " + (numberOfPages - maxNumberOfPages) + " pages for a Short Story.");
        } else {
            return ("You have enough pages for a Short Story.");
        }
    }
}
