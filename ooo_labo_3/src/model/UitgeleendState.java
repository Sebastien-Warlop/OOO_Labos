package model;

public class UitgeleendState extends ProductState{

    /*@Override
    public void uitleenProduct() {
        throw new IllegalArgumentException("Product is al uitgeleend");
    }*/

    @Override
    public void terugbrengen() {
        if (product.isBeschadigd()) {
            product.setState(product.getBeschadigdState());
        } else {
            product.setState(product.getUitleenbaarState());
        }
    }
}
