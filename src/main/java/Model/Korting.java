package Model;

public class Korting {
    private int percentage;
    Boolean bonuskaart;


    public Korting(int percentage, Boolean bonuskaart) {
        this.percentage = percentage;
        this.bonuskaart = bonuskaart;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public Boolean getBonuskaart() {
        return bonuskaart;
    }

    public void setBonuskaart(Boolean bonuskaart) {
        this.bonuskaart = bonuskaart;
    }


}
