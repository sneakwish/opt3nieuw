package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Drank extends Product{
    private Double liter;

    public Drank(String naam, double prijs, Double liter){
        super(naam, prijs);
        this.liter = liter;
    }

//    public Integer getAlcoholPercentage() {
//        return AlcoholPercentage;
//    }
//
//    public void setAlcoholPercentage(Integer alcoholPercentage) {
//        AlcoholPercentage = alcoholPercentage;
//    }

    public String typeProduct() {
        return "Drank:";
    }

    public Boolean gezond(){
        return true;
    }

    public ObservableList<Product> MaakProducten(){
        ObservableList<Product> list = FXCollections.observableArrayList();
        Product Cola = new Drank("Cola", 1.00,  0.5);
        Product Fanta = new Drank("Fanta", 1.49, 0.5);


        list.add(Cola);
        list.add(Fanta);
        return list;

    }

    @Override
    public String toString() {
        return typeProduct() + naam +
                "\nPrijs:€" + prijs;
    }

}
