package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Model.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OverzichtController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Product> tableview;


    @FXML
    private TableColumn<Product, String> kolomNaam;

    @FXML
    private TableColumn<Product, Double> kolomPrijs;

    @FXML
    private Button verzendKnop;

    @FXML
    private Button annuleerKnop;


    public ObservableList<Product> getOverzicht() {
        return Overzicht;
    }

    public void setOverzicht(ObservableList<Product> overzicht) {
        Overzicht = overzicht;
    }

    private ObservableList<Product> Overzicht = FXCollections.observableArrayList();


    @FXML
    void onAnnuleerAction(ActionEvent event) {

    }

    @FXML
    void onVerzendAction(ActionEvent event) {
        HelloController helloController = new HelloController();

        for(Product product : helloController.lijst.getProducten()){
            Overzicht.add(product);
        }
        System.out.println("gfaga");
    }

    @FXML
    void initialize() {
        assert tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'Overzicht.fxml'.";
        assert verzendKnop != null : "fx:id=\"verzendKnop\" was not injected: check your FXML file 'Overzicht.fxml'.";
        assert annuleerKnop != null : "fx:id=\"annuleerKnop\" was not injected: check your FXML file 'Overzicht.fxml'.";
        HelloController helloController = new HelloController();
        for(Product product : helloController.lijst.getProducten()){
            Overzicht.add(product);
        }
        kolomNaam.setCellValueFactory(new PropertyValueFactory<Product, String>("naam"));
        kolomPrijs.setCellValueFactory(new PropertyValueFactory<Product, Double> ("prijs"));

    }
}
