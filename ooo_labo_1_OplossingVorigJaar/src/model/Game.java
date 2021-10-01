package model;

import java.io.Serializable;

public class Game extends Product implements Serializable {
    public Game(String title) {
        super(title);
        setPriceStrategy(new PriceStrategyB());
    }
}
