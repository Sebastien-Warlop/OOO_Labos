package domain;

import javax.swing.*;
import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> products;

    public Shop() {
        //lege lijst
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    public void addProduct(String title,String id,String type) {//niet super blij met implementatie want wat als je nu een ander type product krijgt die andere parameters nodig heeft? overloaden?
        if(type.equals("G")){//voeg game toe
            products.add(new Game(title,type,id));
        }else if (type.equals("M")){
            products.add(new Movie(title,type,id));
        }
    }
    public String getProduct(int id){
        return products.get(id).toString();
    }
    public double getPrice(int id,int days){
        return products.get(id).getPrice(days);
    }
}
