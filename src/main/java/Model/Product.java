package Model;

import java.util.Scanner;

abstract public class Product {
    Scanner scanner = new Scanner(System.in);
    public String naam;
    public double prijs;

    public Product(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public abstract Boolean gezond();

    public String getNaam() {
        return naam;
    }

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
