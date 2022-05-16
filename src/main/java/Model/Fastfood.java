package Model;

public class Fastfood extends Product{

    private Integer vet = 0;

    public Fastfood(String naam, double prijs, int vet){
        super(naam, prijs);
        this.vet=vet;

    }

    public Integer getVet() {
        return vet;
    }

    public String typeProduct() {
        return "Fastfood:";
    }


    public Boolean gezond(){
        return false;
    }

    @Override
    public String toString() {
        return typeProduct() + naam +
                "\nPrijs:€" + prijs+
                "\nvet:" + vet;
    }
}
