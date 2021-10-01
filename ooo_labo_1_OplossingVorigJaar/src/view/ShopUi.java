package view;

import model.*;

import javax.swing.*;

public class ShopUi {
    private Shop shop;

    public ShopUi() throws Exception {
        shop = new Shop();
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n4. Show products\n5. Leen uit\n6. Is beschikbaar\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                addProduct();
            } else if (choice == 2) {
                showProduct();
            } else if (choice == 3) {
                showPrice();
            } else if (choice == 4) {
                showProducts();
            } else if (choice == 5) {
                leenUit();
            } else if (choice == 6) {
                isBeschikbaar();
            }
        }
        shop.addProducts();
    }

    public void addProduct() {
        String title = JOptionPane.showInputDialog("Enter the title:");
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game/C for cd):");
        try {
            if(type.equals("M")) {
                shop.addProduct(new Movie(title));
            }

            if(type.equals("G")) {
                shop.addProduct(new Game(title));
            }

            if(type.equals("C")) {
                shop.addProduct(new Cd(title));
            }

            else {
                JOptionPane.showMessageDialog(null, "Type is invalid");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void showProduct() {
        String id = JOptionPane.showInputDialog("Enter the id:");
        try {
            JOptionPane.showMessageDialog(null, shop.getProduct(id).getTitle());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void showPrice() {
        String id = JOptionPane.showInputDialog("Enter the id:");
        String daysString = JOptionPane.showInputDialog("Enter the number of days:");
        int days = Integer.parseInt(daysString);
        try {
            JOptionPane.showMessageDialog(null, shop.getProduct(id).getPrice(days));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void showProducts() {
        String result = "";
        for(Product product: shop.getProducts()) {
            result += product.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }

    public void leenUit() {
        String id = JOptionPane.showInputDialog("Enter the id:");
        try {
            shop.getProduct(id).leenUit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void isBeschikbaar() {
        String id = JOptionPane.showInputDialog("Enter the id:");
        JOptionPane.showMessageDialog(null, shop.getProduct(id).isBeschikbaar()? "Product is beschikbaar":"Product is niet beschikbaar");
    }
}
