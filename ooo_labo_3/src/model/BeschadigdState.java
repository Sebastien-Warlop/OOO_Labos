package model;

public class BeschadigdState extends ProductState{
    @Override
    public void verwijderProduct(){
        this.product.verwijder();
    }

}
