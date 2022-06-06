package app.opt3nieuw;

import Model.Boodschappenlijst;
import Model.Fruit;
import Model.Product;
import javafx.application.Application;
import javafx.event.ActionEvent;
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

    void goContact(ActionEvent event) {
        System.out.println("lollolol");

    }

    void goBericht(ActionEvent event) {
        System.out.println("lollolol");

    }


    public static void main(String[] args) {
//        Boodschappenlijst lijst = new Boodschappenlijst("1 jan", true);
//        Product bane = new Fruit("nss", 1.50);
//        lijst.voegToe(bane);
        launch();


    }
}