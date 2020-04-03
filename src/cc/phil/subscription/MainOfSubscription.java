package cc.phil.subscription;

public class MainOfSubscription {
    public static void main(String[] args) {
        Subscriber subscriberAdult = new Subscriber(20);
        Subscriber subscriberMature = new Subscriber(14);

        // console output
        // "Neues Abo"
        // "20"
        //Subscription subscription = new Subscription(subscriberAdult);
        //System.out.println(subscription.getPricePerYear());

        // console output
        // "Neues Abo
        // "Neues Premium-Abo"
        // "40"
        //PremiumSubscription premiumSubscription = new PremiumSubscription(subscriberAdult);
        //System.out.println(premiumSubscription.getPricePerYear());

        // console output
        // "Neues Abo"
        // "Neues Super-Premium-Abo"
        // "80"
        //SuperPremiumSubscription superPremiumSubscription = new SuperPremiumSubscription(subscriberAdult);
        //System.out.println(superPremiumSubscription.getPricePerYear());

        // example Schrödinger book
        // console output
        // "Neues Abo"
        // "Neues Super-Premium-Abo"
        // "80"

        SuperPremiumSubscription superPremiumSubscription = new SuperPremiumSubscription(subscriberAdult);
        SubscriptionPriceCalculatorNonStatic subscriptionPriceCalculator =
                new SubscriptionPriceCalculatorNonStatic(superPremiumSubscription);

        System.out.println("Preis/Jahr mit Rabatt: " + subscriptionPriceCalculator.calculatePriceInclusiveDiscount());
        System.out.println("Preis/Jahr ohne Rabatt: " + superPremiumSubscription.getPricePerYearExclusiveDiscount());

        PremiumSubscription premiumSubscription = new PremiumSubscription(subscriberMature);
        SubscriptionPriceCalculatorNonStatic subscriptionPriceCalculator1 = new SubscriptionPriceCalculatorNonStatic(premiumSubscription);

        System.out.println("Preis/Jahr mit Rabatt: " + subscriptionPriceCalculator1.calculatePriceInclusiveDiscount());
        System.out.println("Preis/Jahr ohne Rabatt: " + premiumSubscription.getPricePerYearExclusiveDiscount());

        // Test with static class SubscriptionPriceCalculatorStatic => same result without need to instance this class
        double price = SubscriptionPriceCalculatorStatic.calculatePriceInclusivDiscount(superPremiumSubscription, subscriberMature);
        System.out.println(price);
    }
}
