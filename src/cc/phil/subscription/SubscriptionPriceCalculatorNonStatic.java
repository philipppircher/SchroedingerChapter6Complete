package cc.phil.subscription;

public class SubscriptionPriceCalculatorNonStatic {
    // Membervariables
    //
    private double priceInEuro;
    private Subscriber subscriber;
    private Subscription subscription;
    private double discount;

    // Constructor
    //
    public SubscriptionPriceCalculatorNonStatic(Subscription subscription) {
        this.subscription = subscription;
        this.subscriber = subscription.getSubscriber();
    }

    // Method
    //
    private void setDiscount() {
        if (subscriber.getAge() < 18) {
            if (subscription instanceof SuperPremiumSubscription) {
                discount = 0.5;
            } else if (subscription instanceof PremiumSubscription) {
                discount = 0.75;
            }
        } else {
            discount = 1.0;
        }
    }

    public double calculatePriceInclusiveDiscount() {
        setDiscount();
        priceInEuro = subscription.getPricePerYearExclusiveDiscount() * discount;
        return priceInEuro;
    }

    // Getter
    //
    public double getDiscount() {
        return discount;
    }
}
