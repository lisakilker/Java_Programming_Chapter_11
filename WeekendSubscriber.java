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
public class WeekendSubscriber extends NewspaperSubscriber {
    String subscriptionType;

    public WeekendSubscriber() {
        super();
        setSubscriptionType();
        setSubscriptionRate();
    }

    public void setSubscriptionType() {
        subscriptionType = "Weekend";
    }

    public void setSubscriptionRate() {
        subscriptionRate = 2.00;
    }

    @Override
    public String subscriptionDetails() {
        return ("Subscribers address is : " + subscriberAddress + ". Rate: " + subscriptionRate + ". Service type: " + subscriptionType);
    }

    @Override
    public void getSubscriptionType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSubscriptionRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
