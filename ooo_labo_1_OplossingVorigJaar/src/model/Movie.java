package model;

import java.io.Serializable;

public class Movie extends Product implements Serializable {
    public Movie(String title) {
        super(title);
        setPriceStrategy(new PriceStrategyA());
    }
}
