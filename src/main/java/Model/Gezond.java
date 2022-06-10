package Model;

import java.util.ArrayList;

//Single Responsibility
public class Gezond {
    public Boolean gezond(Product product){
//        for(Product product : lijst){
            if(product instanceof Fruit)
                return true;
            else if(product instanceof AlcoholDrank){
                if((((AlcoholDrank)product)).getAlcoholPercentage() == 0){
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

    public String gezond2(Product product){
        if(gezond(product)){
            return "Gezond!";
        }
        else{
            return "Niet Gezond!";
        }
    }
}
