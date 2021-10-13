package model;

import db.ShopDb;

import java.util.ArrayList;
import java.util.Collections;

public class Shop { //alle interactie via Shop - scheid DB en UI klasse
    private ShopDb shopDb;
    private ArrayList<Product> products;

    public Shop() {
        shopDb = new ShopDb();
        products = new ArrayList<>();
        try {
            products.addAll(shopDb.getProducts());
        } catch(Exception e) {
        }
    }

    public void addProduct(Product product) {
        if(product == null) {
            throw new IllegalArgumentException("Product is null");
        }
        product.setId(Integer.toString(products.size() + 1));
        products.add(product);
    }

    public Product getProduct(String id) {
        if(id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Id is empty");
        }

        Product res = null;

        for(Product product: products) {
            if(product.getId().equals(id)) {
                res = product;
            }
        }

        return res;
    }

    public ArrayList<Product> getProducts() {
        Collections.sort(products);
        return products;
    }

    public void addProducts() throws Exception {
        shopDb.addProducts(products);
    }
}
