
public class Main {
    public static void main(String[] args) {
        PercentageDiscount percentageDiscount = new PercentageDiscount(10);
        ThresholdDiscount thresholdDiscount = new ThresholdDiscount(50, 5);
        BestForCustomer bestForCustomer = new BestForCustomer(10, 50, 5);

        double price = 100;

        System.out.println("Percentage Discounted Price: " + percentageDiscount.discountedPrice(price));
        System.out.println("Threshold Discounted Price: " + thresholdDiscount.discountedPrice(price));
        System.out.println("Best For Customer Price: " + bestForCustomer.discountedPrice(price));
    }
}