package Model;

import java.util.ArrayList;

public class Korting {

    public Double korting(Boodschappenlijst lijst){
        ArrayList<Product> producten = lijst.producten;
        Double korting = 0.0;
        if(producten.size() >=5 && producten.size()<10)
            korting = korting+5;

        else if(producten.size() >=10)
            korting = korting+10;
        if(lijst.getBonuskaart()){
            korting = korting+15;
        }
        return korting;
    }
}
