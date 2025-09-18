package examprep.one.abstraction;

abstract class SubscriptionManager {
    public abstract void renewSubscription(int months);
}

class OnlineSubscription extends SubscriptionManager {
    private int activeMonths;
    private String serviceName;

    public int getActiveMonths() {
        return activeMonths;
    }

    public OnlineSubscription(String serviceName) {
        this.serviceName = serviceName;
        this.activeMonths = 0;
    }

    @Override
    public void renewSubscription(int months) {
        activeMonths += months;
        System.out.println("subscription for " + serviceName + " renewed for " + months);
    }
}

class Main {
    public static void main(String[] args) {
        OnlineSubscription netflix = new OnlineSubscription("netflix");

        netflix.renewSubscription(3);
        netflix.renewSubscription(2);

        System.out.println("active months: " + netflix.getActiveMonths());
    }
}