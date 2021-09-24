package domain;

public class Game extends Product{
    public Game(String productTitle, String productType, String productId) {
        super(productTitle, productType, productId);
    }

    @Override
    public double getPrice(int days) {
        return days * 3;
    }




}
