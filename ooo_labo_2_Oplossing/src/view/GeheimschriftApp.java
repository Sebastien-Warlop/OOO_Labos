package view;

import javafx.application.Application;
import javafx.stage.Stage;

public class GeheimschriftApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GeheimschriftUi geheimschriftUi = new GeheimschriftUi(primaryStage);
    }
}
