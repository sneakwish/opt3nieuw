package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Drank extends Product{
    private Integer AlcoholPercentage = 0;

    public Drank(String naam, double prijs, Integer alcoholPercentage){
        super(naam, prijs);
        this.AlcoholPercentage = alcoholPercentage;
    }

    public Integer getAlcoholPercentage() {
        return AlcoholPercentage;
    }

    public void setAlcoholPercentage(Integer alcoholPercentage) {
        AlcoholPercentage = alcoholPercentage;
    }

    public String typeProduct() {
        return "Drank:";
    }

    public Boolean gezond(){
        return false;
    }

    public ObservableList<Product> MaakProducten(){
        ObservableList<Product> list = FXCollections.observableArrayList();
        Product Cola = new Drank("Cola", 1.00, 0);
        Product Fanta = new Drank("Fanta", 1.49, 0);
        Product Heineken = new Drank("Heineken", 2.50, 5);
        Product Soju = new Drank("Soju", 9.00, 21);
        Product Bacardi = new Drank("Bacardi", 15.00, 35);

        list.add(Cola);
        list.add(Fanta);
        list.add(Heineken);
        list.add(Soju);
        list.add(Bacardi);
        return list;

    }

    @Override
    public String toString() {
        return typeProduct() + naam +
                "\nPrijs:€" + prijs+
                "\nAlcoholPercentage:" + AlcoholPercentage;
    }

}
