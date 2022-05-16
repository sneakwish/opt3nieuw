package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Boodschappenlijst {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> producten = new ArrayList<Product>();
    private String datum;
    Boolean bonuskaart;

    public Boodschappenlijst(String datum, Boolean bonuskaart) {
        this.datum = datum;
        this.bonuskaart = bonuskaart;
    }

    public int totaal()
    {
        int totaal = 0;
        for (Product product : producten) {
            totaal = totaal +=product.prijs;
        }
        return totaal;
    }

    public int korting(){
        int korting = 0;
        if(producten.size() >3){
            korting = korting+3;
            return korting;
        }
        if(bonuskaart){
            korting = korting+5;
            return korting;
        }


        return 0;
    }

    public void addFruit(){
        System.out.println("Naam Fruit");
        String naam = scanner.nextLine();

        System.out.println("Voer in prijs:");
        double prijsFruit = scanner.nextDouble();
        scanner.nextLine();

        Fruit fruit1 = new Fruit(naam, prijsFruit);
        producten.add(fruit1);
        System.out.println(fruit1.getNaam() + " is toegevoegd aan de boodschappenlijst!");
        //test
    }

    @Override
    public String toString() {
        return "Boodschappenlijst{" +
                ", producten=" + producten +
                ", datum='" + datum + '\'' +
                '}';
    }


}
