package cc.phil.subscription;

public class SuperPremiumSubscription extends PremiumSubscription {
    // Constructor
    //
    public SuperPremiumSubscription(Subscriber subscriber) {
        super(subscriber);
        System.out.println("Neues Super-Premium-Abo");
    }

    // Method
    //
    @Override
    public double getPricePerYearExclusiveDiscount() {
        return super.getPricePerYearExclusiveDiscount() * 2;
    }
}
