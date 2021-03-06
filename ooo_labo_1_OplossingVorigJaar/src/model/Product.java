package model;

import java.io.Serializable;

public abstract class Product implements Comparable, Serializable {
    private String id;
    private String title;
    private PriceStrategy priceStrategy;
    private boolean beschikbaar = true;

    public Product(String title) {
        setTitle(title);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Id is empty");
        }

        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        if(title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title is empty");
        }

        this.title = title;
    }

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public double getPrice(int days) {
        if(days <= 0) {
            throw new IllegalArgumentException("Number of days is invalid");
        }
        return priceStrategy.getPrice(days);
    }

    public String toString() {
        return "categorie: " + getClass().getSimpleName() + " id: " + id + " omschrijving: " + title;
    }

    @Override
    public int compareTo(Object o) {
        Product product = (Product) o;
        if (product==null) return 1;
        if (this.getClass() == Movie.class && product.getClass() == Game.class) return -1;
        if (this.getClass() == Movie.class && product.getClass() == Cd.class) return -1;
        if (this.getClass() == Game.class && product.getClass() == Movie.class) return 1;
        if (this.getClass() == Game.class && product.getClass() == Cd.class) return -1;
        if (this.getClass() == Cd.class && product.getClass() == Movie.class) return 1;
        if (this.getClass() == Cd.class && product.getClass() == Game.class) return 1;
        return this.id.compareTo(product.id);
    }

    public void leenUit() {
        if(!isBeschikbaar()) {
            throw new IllegalArgumentException("Je kan het product niet uitlenen");
        }
        this.beschikbaar = false;
    }

    public boolean isBeschikbaar() {
        return beschikbaar;
    }
}
