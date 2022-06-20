package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoodschappenlijstTest {

    Boodschappenlijst lijst1;
    @BeforeEach
    public void maak(){
        lijst1 = new Boodschappenlijst("1-2-2019", true);
    }

    @Test
    void condition(){
        //1 0 = 1
        Assertions.assertEquals(15, lijst1.korting());
        lijst1.setBonuskaart(false);
        lijst1.addProduct("Banaan", 1.00);
        lijst1.addProduct("Manderijn", 2.00);
        lijst1.addProduct("Druif", 3.00);
        lijst1.addProduct("Appel", 4.00);
        lijst1.addProduct("aardbij", 4.00);
        //0 1 = 1
        Assertions.assertEquals(5, lijst1.korting());
    }

    @Test
    void decision() {
        //0 0 = 0
        lijst1.setBonuskaart(false);
        Assertions.assertEquals(0, lijst1.korting());
        //1 0 = 0
        lijst1.setBonuskaart(true);
        Assertions.assertEquals(15, lijst1.korting());
    }

    @Test
    void multipleCondition() {
        //0 0 = 0
        lijst1.setBonuskaart(false);
        Assertions.assertEquals(0, lijst1.korting());
        //1 0 = 1
        lijst1.setBonuskaart(true);
        Assertions.assertEquals(15, lijst1.korting());
        //0 1 = 1
        lijst1.setBonuskaart(false);
        lijst1.addProduct("Banaan", 1.00);
        lijst1.addProduct("Manderijn", 2.00);
        lijst1.addProduct("Druif", 3.00);
        lijst1.addProduct("Appel", 4.00);
        lijst1.addProduct("aardbei", 4.00);
        Assertions.assertEquals(5, lijst1.korting());
        //1 1 = 1
        lijst1.setBonuskaart(true);
        Assertions.assertEquals(20, lijst1.korting());
    }

    @Test
    void conditionDecision() {
        //0 0 = 0
        lijst1.setBonuskaart(false);
        Assertions.assertEquals(0, lijst1.korting());
        //1 0 = 1
        lijst1.setBonuskaart(true);
        Assertions.assertEquals(15, lijst1.korting());
        //0 1 = 1
        lijst1.setBonuskaart(false);
        lijst1.addProduct("Banaan", 1.00);
        lijst1.addProduct("Manderijn", 2.00);
        lijst1.addProduct("Druif", 3.00);
        lijst1.addProduct("Appel", 4.00);
        lijst1.addProduct("aardbei", 4.00);
        Assertions.assertEquals(5, lijst1.korting());
        //1 1 = 1
        lijst1.setBonuskaart(true);
        Assertions.assertEquals(20, lijst1.korting());
    }

    @Test
    void ModifiedConditionDecisionCoverage() {
        //0 0 = 0
        lijst1.setBonuskaart(false);
        Assertions.assertEquals(0, lijst1.korting());
        //1 0 = 1
        lijst1.setBonuskaart(true);
        Assertions.assertEquals(15, lijst1.korting());
        //0 1 = 1
        lijst1.setBonuskaart(false);
        lijst1.addProduct("Banaan", 1.00);
        lijst1.addProduct("Manderijn", 2.00);
        lijst1.addProduct("Druif", 3.00);
        lijst1.addProduct("Appel", 4.00);
        lijst1.addProduct("aardbei", 4.00);
        Assertions.assertEquals(5, lijst1.korting());
    }

    void Equivalentieklassen() {
        lijst1.setBonuskaart(false);
        lijst1.addProduct("Banaan", 1.00);
        lijst1.addProduct("Manderijn", 2.00);
        lijst1.addProduct("Druif", 3.00);
        lijst1.addProduct("Appel", 4.00);
        lijst1.addProduct("aardbei", 4.00);
        Assertions.assertEquals(5, lijst1.korting());
        Assertions.assertEquals(0, lijst1.korting());
        Assertions.assertEquals(15, lijst1.korting());
    }
}