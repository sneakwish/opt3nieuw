package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Desert extends Product{

    private Integer Suikergehalte = 0;


    public Desert(String naam, double prijs, Integer suikergehalte){
        super(naam, prijs);
        Suikergehalte = suikergehalte;

    }

    public Integer getSuikergehalte() {
        return Suikergehalte;
    }


    public String typeProduct() {
        return "Desert:";
    }


    public Boolean gezond(){
        return false;
    }

    public ObservableList<Product> MaakProducten(){
        ObservableList<Product> desert = FXCollections.observableArrayList();
        Product appeltaart = new Desert("appeltaart", 1.00, 20);
        Product slagroomijs = new Desert("slagroomijs", 2.50, 5);
        Product cupcake = new Desert("cupcake", 3.00, 2);

        desert.add(cupcake);
        desert.add(slagroomijs);
        desert.add(appeltaart);

        return desert;
    }

    @Override
    public String toString() {
        return typeProduct() + naam +
                "\nPrijs:€" + prijs+
                "\nsuikergehalte:" + Suikergehalte;
    }
}
