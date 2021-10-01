package model;

import java.io.Serializable;

public class PriceStrategyB implements PriceStrategy, Serializable {
    @Override
    public double getPrice(int days) {
        return days * 3;
    }
}
