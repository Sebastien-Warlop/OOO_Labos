package ui;

import javax.swing.*;

public class Ui {
    public static int showMenu(){
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        String choiceString = JOptionPane.showInputDialog(menu);
        return Integer.parseInt(choiceString);
    }
    public static String getTitle() {
        return JOptionPane.showInputDialog("Enter the title:");
    }
    public static String getId() {
        /*String id = JOptionPane.showInputDialog("Enter the id:");
        return Integer.parseInt(id);
        //indien het niet werkt exception gooien
        //int kan ook gebruikt worden.
        */
        return JOptionPane.showInputDialog("Enter the id:");

    }
    public static String getType() {
        return JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
    }

    public static int getDagen() {
        String dagen = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
        return Integer.parseInt(dagen);
    }
}