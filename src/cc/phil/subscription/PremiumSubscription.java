package cc.phil.subscription;

public class PremiumSubscription extends Subscription {
    // Constructor
    //
    public PremiumSubscription(Subscriber subscriber) {
        super(subscriber);
        System.out.println("Neues Premium-Abo");
    }

    // Method
    //
    @Override
    public double getPricePerYearExclusiveDiscount() {
        return super.getPricePerYearExclusiveDiscount() * 2;
    }
}
