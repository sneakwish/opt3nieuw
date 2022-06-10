package Model;

import javafx.collections.ObservableList;

import java.util.Scanner;

public abstract class Product{
    Scanner scanner = new Scanner(System.in);
    public String naam;
    public double prijs;
    public static final int prijsStart = 0;


    public Product(String naam, double prijs) {
        this.naam = naam;
        this.prijs =    berekenPrijsStap3(
                        berekenPrijsStap2(
                        berekenPrijsStap1(prijs)));
    }

//    public abstract Boolean gezond();
//    public Boolean gezond(){
//        return true;
//    }


    public String getNaam() {
        return naam;
    }

    public double berekenPrijsStap1(double start){
        return start;
    }

    public abstract double berekenPrijsStap2(double stap1);

    public double berekenPrijsStap3(double stap2){
        double btw = 0.19;
        double btwPrijs = stap2 * btw;
        return stap2+btwPrijs;
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
