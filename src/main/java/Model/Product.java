package Model;

import javafx.collections.ObservableList;

import java.util.Scanner;

public abstract class Product {
    Scanner scanner = new Scanner(System.in);
    public String naam;
    public double prijs;

    public Product(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public abstract Boolean gezond();
//    public Boolean gezond(){
//        return true;
//    }

    public String getNaam() {
        return naam;
    }

    public abstract ObservableList<Product> MaakProducten();

    public String typeProduct() {
        return "Product:";
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

}
