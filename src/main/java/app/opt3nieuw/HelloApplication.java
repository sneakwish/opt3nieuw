package app.opt3nieuw;

import Model.Factory1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/app/View/HomeScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 530);
        stage.setTitle("Boodschappenlijst!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//        Boodschappenlijst lijst = new Boodschappenlijst("1 jan", true);
//        Product bane = new Fruit("nss", 1.50);
//        lijst.voegToe(bane);

        launch();


    }
}