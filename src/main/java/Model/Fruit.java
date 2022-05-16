package Model;

public class Fruit extends Product{
    private final String vitamine = "C";
    private static int mineralen = 0;

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

    @Override
    public String toString() {
        return typeProduct() + naam +
                "\nPrijs:€" + prijs+
                "\nVitamine: " + vitamine+
                "\nMineralen:" + mineralen+
                "\n";
    }
}
