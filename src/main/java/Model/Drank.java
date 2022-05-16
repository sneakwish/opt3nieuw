package Model;

public class Drank extends Product{
    private Integer AlcoholPercentage = 0;

    public Drank(String naam, double prijs, Integer alcoholPercentage){
        super(naam, prijs);
        this.AlcoholPercentage = alcoholPercentage;

    }
    public String typeProduct() {
        return "Drank:";
    }


    public Boolean gezond(){
        return false;
    }

    //maak dranken aan


    @Override
    public String toString() {
        return typeProduct() + naam +
                "\nPrijs:€" + prijs+
                "\nvet:" + AlcoholPercentage;
    }

}
