package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Fastfood extends Product{
    private int vet = 0;

    public Fastfood(String naam, double prijs, int vet){
        super(naam, prijs);
        this.vet=vet;
    }

    public double berekenPrijsStap2(double stap2){
        if(vet> 2){
            double vetBTW =  stap2 * 0.03;
            return stap2 + vetBTW;
        }
        return stap2;
    }

    public int getVet() {
        return vet;
    }

    public void setVet(Integer vet) {
        this.vet = vet;
    }

    public ObservableList<Product> MaakProducten(){
        ObservableList<Product> fastfood = FXCollections.observableArrayList();
        Product pizza = new Fastfood("pizza", 15.00, 20);
        Product frikandel = new Fastfood("frikandel", 2.50, 5);
        Product patat = new Fastfood("patat", 1.99, 2);

        fastfood.add(pizza);
        fastfood.add(frikandel);
        fastfood.add(patat);

        return fastfood;
    }

    public String typeProduct() {
        return "Fastfood:";
    }


    public Boolean gezond(){
        return false;
    }

    @Override
    public String toString() {
        return typeProduct() + naam +
                "\nPrijs:€" + prijs+
                "\nvet:" + vet;
    }
}
