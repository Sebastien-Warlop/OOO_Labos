package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import model.CaesarcijferGeheimschriftStrategy;
import model.Geheimschrift;
import model.SpiegelingGeheimschriftStrategy;

public class GeheimschriftUi {
    public GeheimschriftUi(Stage primaryStage) {
        primaryStage.setTitle("Geheimschrift applicatie"); //titel bovenaan applicatie (naast kruisje en - voor verkleinen)

        final ComboBox geheimschriftComboBox = new ComboBox<>();    // box met combinaties
        geheimschriftComboBox.getItems().addAll("Caesarcijfer", "Spiegeling"); //zet 2 mogelijkheden in combobox: ceasarcijfer & spiegeling
        geheimschriftComboBox.setValue("Caesarcijfer");             //zetstandaardvalue

        TextField textField = new TextField();  //nieuw textveld

        Button codeerButton = new Button("Codeer");  //2 nieuwe buttons aanmaken
        Button decodeerButton = new Button("Decodeer");

        TextField text = new TextField();       // NA de 2 knoppen nog een textveld (hierin zal de output komen, daarom als laatste -> overzichtelijkste)
        text.setEditable(false);

        FlowPane root = new FlowPane(); //hover over FlowPane voor info
        root.setAlignment(Pos.BASELINE_CENTER);
        root.setVgap(5);    //zie ppt JavaFX -> meer uitleg over deze dingen
        root.setHgap(5);
        root.getChildren().add(new Label("Tekst")); //voer Tekst toe als label voor 1e textfield
        root.getChildren().add(textField);
        root.getChildren().add(geheimschriftComboBox);  //de knop (combobox) met daarin de keuze ceasarcijfer of spiegeling
        root.getChildren().add(codeerButton);
        root.getChildren().add(decodeerButton);
        root.getChildren().add(text);           //alles toevoegen aan de root => root is een FlowPane => hier alles als childrens aan toevoegen

        Scene mainScene = new Scene(root, 250, 100);

        primaryStage.setScene(mainScene);   //hier zet je de primaryStage als de Scene, hierboven aangemaakt => dit moet omdat je in de App => GeheimschriftUi klasse aanroept met PrimaryStage parameterS

        primaryStage.show();

        codeerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(geheimschriftComboBox.getSelectionModel().getSelectedItem().toString().equals("Caesarcijfer")) { //als in de combobox Caesarcijfer is aangeduid, doe:
                    Geheimschrift geheimschrift = new Geheimschrift(textField.getText(), new CaesarcijferGeheimschriftStrategy());
                    geheimschrift.codeer(); //voer de codeerfunctie erop uit
                    text.setText(geheimschrift.getTekst());  //naam van 2e textfield = text => setText van 2e textfield als => hierboven geheimschrift gecodeert
                } else if(geheimschriftComboBox.getSelectionModel().getSelectedItem().toString().equals("Spiegeling")) {
                    Geheimschrift geheimschrift = new Geheimschrift(textField.getText(), new SpiegelingGeheimschriftStrategy());
                    geheimschrift.codeer();
                    text.setText(geheimschrift.getTekst());
                }
            }
        });

        decodeerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(geheimschriftComboBox.getSelectionModel().getSelectedItem().toString().equals("Caesarcijfer")) {
                    Geheimschrift geheimschrift = new Geheimschrift(textField.getText(), new CaesarcijferGeheimschriftStrategy());
                    geheimschrift.decodeer();
                    text.setText(geheimschrift.getTekst());
                } else if (geheimschriftComboBox.getSelectionModel().getSelectedItem().toString().equals("Spiegeling")) {
                    Geheimschrift geheimschrift = new Geheimschrift(textField.getText(), new SpiegelingGeheimschriftStrategy());
                    geheimschrift.decodeer();
                    text.setText(geheimschrift.getTekst());
                }
            }
        });
    }
}
