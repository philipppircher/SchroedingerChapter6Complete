package cc.phil.subscription;

public class SubscriptionPriceCalculatorStatic {
    // Method
    //
    private static double getDiscount(Subscription subscription, Subscriber subscriber) {
        double discount = 0;
        if (subscriber.getAge() < 18) {
            if (subscription instanceof SuperPremiumSubscription) {
                discount = 0.5;
            } else if (subscription instanceof PremiumSubscription) {
                discount = 0.75;
            }
        } else {
            discount = 1.0;
        }
        return discount;
    }

    public static double calculatePriceInclusivDiscount(Subscription subscription, Subscriber subscriber) {
        double discount = getDiscount(subscription, subscriber);
        return subscription.getPricePerYearExclusiveDiscount() * discount;
    }
}
