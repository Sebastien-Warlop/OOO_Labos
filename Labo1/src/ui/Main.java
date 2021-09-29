package ui;

import domain.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        int choice = -1;
        while (choice != 0) {
            Ui.showMenu();
            choice = Ui.showMenu();
            if (choice == 1) {
                String title = Ui.getTitle();
                String id = Ui.getId();
                String type = Ui.getType();
                shop.addProduct(title,id,type);

            } else if (choice == 2) {
                //get parameter
                //shop.showProduct(shop);
                String id = Ui.getId();
                shop.getProduct(Integer.parseInt(id));
            } else if (choice == 3){
                //shop.showPrice(shop);
                //Get parameters
                //id en dan dagen
                String id = Ui.getId();
                int dagen = Ui.getDagen();

            }
            //trg nr hoofdmenu?
        }
    }
}