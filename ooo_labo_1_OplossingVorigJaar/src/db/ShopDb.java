package db;

import model.*;

import java.io.*;
import java.util.ArrayList;

public class ShopDb {

    public ShopDb() {
    }

    public void addProducts(ArrayList<Product> products) throws Exception {
        FileOutputStream fs = new FileOutputStream("shop.txt");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(products);
        os.close();
    }

    public ArrayList<Product> getProducts() throws Exception {
        FileInputStream fs = new FileInputStream("shop.txt");
        ObjectInputStream os = new ObjectInputStream(fs);
        ArrayList<Product> products = (ArrayList<Product>) os.readObject();
        os.close();
        return products;
    }
}
