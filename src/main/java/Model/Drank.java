package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Drank extends Product{
    private double liter;

    public Drank(String naam, double prijs, double liter){
        super(naam, prijs);
        this.liter = liter;
    }



    public String typeProduct() {
        return "Drank:";
    }

    public Boolean gezond(){
        return true;
    }


    public double berekenPrijsStap2(double stap2){
        if(liter> 1){
            double DrankKorting = stap2 * 0.05;
            return stap2 - DrankKorting;
        }
        return stap2;
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
