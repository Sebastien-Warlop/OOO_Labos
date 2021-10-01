package model;

import java.io.Serializable;

public class PriceStrategyC implements PriceStrategy, Serializable {
    @Override
    public double getPrice(int days) {
        return days * 1.5;
    } //deze is voor de CD (1,5 eur per dag)
}
