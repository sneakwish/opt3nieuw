package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AlcoholDrank extends Drank{

    private int alcoholPercentage;

    public AlcoholDrank(String naam, double prijs, Double liter, int alcoholPercentage) {
        super(naam, prijs, liter);
        this.alcoholPercentage = alcoholPercentage;
    }

    public ObservableList<Product> MaakProducten(){
        ObservableList<Product> list = FXCollections.observableArrayList();
        Product Heineken = new AlcoholDrank("Heineken", 2.50, 1.0, 5);
        Product Soju = new AlcoholDrank("Soju", 9.00, 1.0, 25);
        Product Bacardi = new AlcoholDrank("Bacardi", 15.00,  1.0, 35);

        list.add(Heineken);
        list.add(Soju);
        list.add(Bacardi);
        return list;

    }
    public int getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(int alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

//    public Boolean gezond(){
//        return true;
//    }

    @Override
    public String toString() {
        return "AlcoholDrank{" +
                "alcoholPercentage=" + alcoholPercentage +
                ", naam='" + naam + '\'' +
                ", prijs=" + prijs +
                ", alcoholPercentage='" + alcoholPercentage + '\'' +
                '}';
    }

}
