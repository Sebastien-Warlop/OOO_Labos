package model;

public abstract class ProductState {
    private Product product;

    public void verwijderProduct(){
        throw new IllegalArgumentException();
    }
    public void uitleenProduct(){
        throw new IllegalArgumentException();
    }
    public void brengTerugProduct(){
        throw new IllegalArgumentException();
    }
    public void herstelProduct(){
        throw new IllegalArgumentException();
    }
}
