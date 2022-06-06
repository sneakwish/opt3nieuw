package Model;

import java.util.ArrayList;

public class Gezond {
    public Boolean gezond(Product product){
//        for(Product product : lijst){
            if(product instanceof Fruit)
                return true;
            else if(product instanceof Drank){
                if((((Drank)product)).getAlcoholPercentage() == 0){
                    return true;
                }else{
                    return false;
                }
            }
            else if(product instanceof Desert) {
                if ((((Desert) product)).getSuikergehalte() == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            else if(product instanceof Fastfood){
                if ((((Fastfood) product)).getVet() == 0) {
                    return true;
                } else {
                    return false;
                }
            }
//        }
        return false;
    }
}
