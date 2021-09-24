package domain;

public class Movie extends Product{

    public Movie(String productTitle, String productType, String productId) {
        super(productTitle, productType, productId);
    }

    @Override
    public double getPrice(int days) {
        double price = 0;
        price = 5;
        int daysLeft = days - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;
    }
}
