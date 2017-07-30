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
public class StoryDemo extends Story {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Story aStory[] = new Story[6];
        
        aStory[0] = new Novel();
        aStory[0].setStoryTitle("The Deep Blue Sea");
        aStory[0].setAuthorName("Mary Steinberg");
        aStory[0].setNumberOfPages(10);
        
        aStory[1] = new Novel();
        aStory[1].setStoryTitle("First Glance");
        aStory[1].setAuthorName("George Miller");
        aStory[1].setNumberOfPages(200);
        
        aStory[2] = new Novella();
        aStory[2].setStoryTitle("Second to None");
        aStory[2].setAuthorName("Kimberly Smith");
        aStory[2].setNumberOfPages(50);
        
        aStory[3] = new Novella();
        aStory[3].setStoryTitle("Third in Line");
        aStory[3].setAuthorName("Stanley Kubrick");
        aStory[3].setNumberOfPages(150);
        
        aStory[4] = new ShortStory();
        aStory[4].setStoryTitle("Forth Be With You");
        aStory[4].setAuthorName("Han Solo");
        aStory[4].setNumberOfPages(150);
        
        aStory[5] = new ShortStory();
        aStory[5].setStoryTitle("Fifth Element");
        aStory[5].setAuthorName("Bruce Willis");
        aStory[5].setNumberOfPages(20);
        
        System.out.println("Title:  " + aStory[0].getStoryTitle() + ", Author: " + aStory[0].getAuthorName()
        + ", Number of Pages: " + aStory[0].getNumberOfPages() + ", Message: " + aStory[0].setMessage());
        
        System.out.println("Title:  " + aStory[1].getStoryTitle() + ", Author: " + aStory[1].getAuthorName()
        + ", Number of Pages: " + aStory[1].getNumberOfPages() + ", Message: " + aStory[1].setMessage());
        
        System.out.println("Title:  " + aStory[2].getStoryTitle() + ", Author: " + aStory[2].getAuthorName()
        + ", Number of Pages: " + aStory[2].getNumberOfPages() + ", Message: " + aStory[2].setMessage());
        
        System.out.println("Title:  " + aStory[3].getStoryTitle() + ", Author: " + aStory[3].getAuthorName()
        + ", Number of Pages: " + aStory[3].getNumberOfPages() + ", Message: " + aStory[3].setMessage());
        
        System.out.println("Title:  " + aStory[4].getStoryTitle() + ", Author: " + aStory[4].getAuthorName()
        + ", Number of Pages: " + aStory[4].getNumberOfPages() + ", Message: " + aStory[4].setMessage());
        
        System.out.println("Title:  " + aStory[5].getStoryTitle() + ", Author: " + aStory[5].getAuthorName()
        + ", Number of Pages: " + aStory[5].getNumberOfPages() + ", Message: " + aStory[5].setMessage());
    }

    @Override
    public String setMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
