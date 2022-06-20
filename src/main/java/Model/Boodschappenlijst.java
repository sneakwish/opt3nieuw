package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Boodschappenlijst implements Korting2, Bonuskaart {
    private Scanner scanner = new Scanner(System.in);
    ArrayList<Product> producten = new ArrayList<Product>();
    private String datum;
    private Boolean bonuskaart;

    public ArrayList<Product> getProducten() {
        return producten;
    }

    public void setProducten(ArrayList<Product> producten) {
        this.producten = producten;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public Boolean getBonuskaart() {
        return bonuskaart;
    }

    public void setBonuskaart(Boolean bonuskaart) {
        this.bonuskaart = bonuskaart;
    }

    public Boodschappenlijst(String datum, Boolean bonuskaart) {
        this.datum = datum;
        this.bonuskaart = bonuskaart;
    }

    public Double totaal()
    {
        Double totaal = 0.0;
        for (Product product : producten) {
            totaal = totaal +=product.prijs;
        }
        return totaal;
    }

    public Double korting(){
        Double korting = 0.0;
        if(producten.size() >=5 && producten.size()<10)
            korting = korting+5;

        else if(producten.size() >=10)
            korting = korting+10;
        if(bonuskaart){
            korting = korting+15;
        }
        return korting;
    }

    public Boolean heeftKorting(){
        if(korting() == 0){
            return false;
        } else{
            return true;
        }
    }

    public void addProduct(String naam, Double prijs){
//        System.out.println("Naam Fruit");
//        String naam = scanner.nextLine();
//
//        System.out.println("Voer in prijs:");
//        double prijsFruit = scanner.nextDouble();
//        scanner.nextLine();

        Fruit fruit1 = new Fruit(naam, prijs, 6);
        producten.add(fruit1);
        System.out.println(fruit1.getNaam() + " is toegevoegd aan de boodschappenlijst!");
        System.out.println();
    }

    public void voegToe(Product product){
        producten.add(product);
        System.out.println(product.getNaam() + " is toegevoeg aan de boodschappenlijst!");

    }

    @Override
    public String toString() {
        return "Boodschappenlijst{" +
                ", producten=" + producten +
                '}';
    }


}
