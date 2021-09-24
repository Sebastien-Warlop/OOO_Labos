package domain;

import java.util.ArrayList;

public abstract class Product { //abstracte klasse aangezien je hier geen instanties van hoort te maken
    private String productTitle;
    private String productType;
    private String productId;

    public Product(String productTitle, String productType, String productId) {
        this.productTitle = productTitle;
        this.productType = productType;
        this.productId = productId;
    }

    public abstract double getPrice(int Days);
    public String toString(){return productType+productId+productTitle;}

}
