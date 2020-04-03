package cc.phil.subscription;

public class Subscription {
    // Membervariables
    //
    private Subscriber subscriber;

    // Constructor
    //
    public Subscription(Subscriber subscriber) {
        System.out.println("Neues Abo");
        this.subscriber = subscriber;
    }

    // Method
    //
    public double getPricePerYearExclusiveDiscount() {
        return 20.0;
    }

    // Getter
    //
    public Subscriber getSubscriber() {
        return subscriber;
    }
}
