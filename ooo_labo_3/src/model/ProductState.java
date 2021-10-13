package model;

public abstract class ProductState {
    protected Product product;

    public void verwijderProduct(){
        throw new IllegalArgumentException();
    }
    public void uitleenProduct(){
        throw new IllegalArgumentException("Product is al uitgeleend");
    }
    public static void brengTerugProduct(){
        ProductState.brengTerugProduct();
    }
    public void herstelProduct(){
        throw new IllegalArgumentException();
    }

    public abstract void terugbrengen();
}
