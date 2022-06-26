package Controller;

import Model.*;
import app.opt3nieuw.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static eu.hansolo.tilesfx.tools.Helper.round;


public class HelloController {

    public Boodschappenlijst getLijst() {
        return lijst;
    }

    public void setLijst(Boodschappenlijst lijst) {
        this.lijst = lijst;
    }

    Boodschappenlijst lijst = new Boodschappenlijst("1 jan", true);
    Seeder seeder  = new Seeder();


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
    void ToonOverzicht(ActionEvent event) throws IOException {
        ObservableList<Product> overzicht = FXCollections.observableArrayList();
        for(Product product : lijst.getProducten()){
            overzicht.add(product);
        }
        Pane root = FXMLLoader.load(getClass().getResource("/app/View/Overzicht.fxml"));

        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);

        OverzichtController overzichtController = new OverzichtController();
        overzichtController.setOverzicht(overzicht);
//        System.out.println(overzicht);
        System.out.println(lijst.korting());


//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Overzicht.fxml"));
//        OverzichtController controller = fxmlLoader.<OverzichtController>getController();
//        controller.setOverzicht(overzicht);


        dialogStage.setScene(new Scene(root, 400, 500));
        dialogStage.showAndWait();
    }

    @FXML
    void VoegToe(ActionEvent event) {
        Product yo = tableview.getSelectionModel().getSelectedItem();

        lijst.voegToe(yo);
        updateHuidigekosten(round(lijst.totaal(), 2));
    }

    @FXML
    void getFruits(ActionEvent event) {
        tableview.setItems(seeder.fruitLijst());
    }

    @FXML
    void getDesserts(ActionEvent event) {
        tableview.setItems(seeder.desertLijst());
    }

    @FXML
    void getDranken(ActionEvent event) {
        tableview.setItems(seeder.drankLijst());
    }

    @FXML
    void getFastfoods(ActionEvent event) {
        tableview.setItems(seeder.fastfoodLijst());
    }

    void updateHuidigekosten(Double totaal){
        huidigeKosten.setText(""+totaal);
    }


    @FXML
    void initialize() {
        kolomNaam.setCellValueFactory(new PropertyValueFactory<Product, String>("naam"));
        kolomPrijs.setCellValueFactory(new PropertyValueFactory<Product, Double> ("prijs"));
    }
}