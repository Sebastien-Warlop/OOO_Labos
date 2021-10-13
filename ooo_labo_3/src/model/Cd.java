package model;

public class Cd extends Product {
    public Cd(String title) {
        super(title);
        setPriceStrategy(new PriceStrategyC()); //dit omdat het exact hetzelfde voor de rest is als een product maar heeft een eigen priceStrategy
    }
}
