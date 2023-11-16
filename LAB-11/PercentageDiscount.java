
public class PercentageDiscount implements Discountable {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double discountedPrice(double price) {
        return price * (1 - percentage / 100);
    }
}