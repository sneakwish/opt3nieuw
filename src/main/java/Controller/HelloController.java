package Controller;

import Model.*;
import app.opt3nieuw.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;


public class HelloController {
    Boodschappenlijst lijst = new Boodschappenlijst("1 jan", true);

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private MenuItem getFruitsKnop;

    @FXML
    private MenuItem getDessertsKnop;

    @FXML
    private MenuItem getDrankenKnop;

    @FXML
    private MenuItem getFastfoodsKnop;


    @FXML
    private TableView<Product> tableview;

    @FXML
    private TableColumn<Product, String> kolomNaam;

    @FXML
    private TableColumn<Product, Double> kolomPrijs;

    @FXML
    private Button bericht;

    @FXML
    private Button contact;

    @FXML // fx:id="OverzichtKnop"
    private Button OverzichtKnop; // Value injected by FXMLLoader

    @FXML // fx:id="VoegToeKnop"
    private Button VoegToeKnop; // Value injected by FXMLLoader

    @FXML // fx:id="huidigeKosten"
    private Text huidigeKosten; // Value injected by FXMLLoader

    @FXML
    private Button GegevensKnop;

    @FXML
    void GegevensProduct(ActionEvent event) {
        Alert gegevensProductAlert = new Alert(Alert.AlertType.INFORMATION);
        gegevensProductAlert.setTitle("Gegevens Product");
        gegevensProductAlert.setHeaderText("Productgegevens:");
        Product yo = tableview.getSelectionModel().getSelectedItem();
//        for(Product product : lijst.getProducten()){
//            yo+=product;
//        }
        gegevensProductAlert.setContentText(yo.toString());
        gegevensProductAlert.showAndWait();

    }

    @FXML
    void ToonOverzicht(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Overzicht");
        alert.setHeaderText("Boodschappenlijst:");
        ArrayList<Product> list = new ArrayList<Product>();
        String yo = "";
        Product prod = tableview.getSelectionModel().getSelectedItem();
        for(Product product : lijst.getProducten()){
            yo+=product;
        }
        alert.setContentText(yo);
        alert.showAndWait();
    }

    @FXML
    void VoegToe(ActionEvent event) {
        Product yo = tableview.getSelectionModel().getSelectedItem();

        lijst.voegToe(yo);
        System.out.println(lijst.getProducten());
    }

    @FXML
    void getFruits(ActionEvent event) {
        Fruit temp = new Fruit("temp", 1.00);
        tableview.setItems(temp.MaakProducten());
    }

    @FXML
    void getDesserts(ActionEvent event) {
        Desert temp = new Desert("temp", 1.00, 52);
        tableview.setItems(temp.MaakProducten());
    }

    @FXML
    void getDranken(ActionEvent event) {
        Drank temp = new Drank("temp", 1.00, 52);
        tableview.setItems(temp.MaakProducten());
    }

    @FXML
    void getFastfoods(ActionEvent event) {
        Fastfood temp = new Fastfood("temp", 1.00, 52);
        tableview.setItems(temp.MaakProducten());
    }

    @FXML
    void initialize() {
        kolomNaam.setCellValueFactory(new PropertyValueFactory<Product, String>("naam"));
        kolomPrijs.setCellValueFactory(new PropertyValueFactory<Product, Double> ("prijs"));
    }

    void goContact(ActionEvent event) {
        System.out.println("lollolol");
    }

    void goBericht(ActionEvent event) {
        System.out.println("lollolol");
    }
}