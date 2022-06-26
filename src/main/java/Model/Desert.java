package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Desert extends Gezond {

    private int suikergehalte;

    public Desert(String naam, double prijs, int suikergehalte){
        super(naam, prijs);
        this.suikergehalte = suikergehalte;

    }

    public double berekenPrijsStap2(double stap2){
        if(suikergehalte> 2){
            double suikerBTW =  stap2 * 0.03;
            return stap2 + suikerBTW;
        }
        return stap2;
    }

    public int getSuikergehalte() {
        return suikergehalte;
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
                "\nsuikergehalte:" + suikergehalte;
    }
}
