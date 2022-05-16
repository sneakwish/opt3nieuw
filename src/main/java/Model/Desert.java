package Model;

public class Desert extends Product{

    private static Integer getSuikergehalte = 0;

    public Desert(String naam, double prijs){
        super(naam, prijs);
        getSuikergehalte+=10;

    }

    public Integer getSuikergehalte() {
        return getSuikergehalte;
    }


    public String typeProduct() {
        return "Desert:";
    }


    public Boolean gezond(){
        return false;
    }

    @Override
    public String toString() {
        return typeProduct() + naam +
                "\nPrijs:€" + prijs+
                "\nsuikergehalte:" + getSuikergehalte;
    }
}
