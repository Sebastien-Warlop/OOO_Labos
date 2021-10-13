package model;

public class UitleenbaarState extends ProductState{
    @Override
    public void uitleenProduct(){
        this.product.leenUit();
    }

    @Override
    public void verwijderProduct(){
        this.product.verwijder();
    }
}
