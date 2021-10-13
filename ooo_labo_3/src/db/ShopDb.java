package db;

import model.Product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
