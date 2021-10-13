package model;

public class UitgeleendState extends ProductState{

    @Override
    public void uitleenProduct() {
        throw new IllegalArgumentException("Product is al uitgeleend");
    }

    /*@Override
    public void terugbrengen() {
        if (product.isBeschad)
    }*/

    @Override
    public double getStatePrice(int days) {
        return product.getPrice(days/5);
    }

}
