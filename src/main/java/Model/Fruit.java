package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Fruit extends Product{
    private final String vitamine = "C";
    private int mineralen = 0;

    public Fruit(String naam, double prijs) {
        super(naam, prijs);

    }

    public String getVitamine() {
        return vitamine;
    }

    public int getMineralen() {
        return mineralen;
    }

    public String typeProduct() {
        return "Fruit:";
    }

    public Boolean gezond(){
        return true;
    }

    public ObservableList<Product> MaakProducten(){
        ObservableList<Product> fruits = FXCollections.observableArrayList();
        Product banaan = new Fruit("Banaan", 1.00);
        Product appel = new Fruit("appel", 2.50);
        Product peer = new Fruit("peer", 3.00);

        fruits.add(banaan);
        fruits.add(appel);
        fruits.add(peer);

        return fruits;
    }

    @Override
    public String toString() {
        return typeProduct() + naam +
                "\nPrijs:€" + prijs+
                "\nVitamine: " + vitamine+
                "\nMineralen:" + mineralen+
                "\n";
    }
}
