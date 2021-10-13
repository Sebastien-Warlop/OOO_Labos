package view;

import javafx.application.Application;
import javafx.stage.Stage;

public class ShopApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ShopUi shopUi = new ShopUi();
    }
}
