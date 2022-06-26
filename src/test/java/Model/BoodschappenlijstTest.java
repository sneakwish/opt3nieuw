package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoodschappenlijstTest {

    Boodschappenlijst lijst1;

    @BeforeEach
    public void maak() {
        lijst1 = new Boodschappenlijst("1-2-2019", true);
    }

    @Test
    void condition() {
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

    @Test
    void Equivalentieklassen() {
        lijst1.setBonuskaart(false);
//        Equivalentieklasse 1: 0% korting
        Assertions.assertEquals(0, lijst1.korting());

        lijst1.addProduct("1", 1.00);
        lijst1.addProduct("2", 2.00);
        Assertions.assertEquals(0, lijst1.korting());

//        Equivalentieklasse 2: 5% korting
        lijst1.addProduct("3", 3.00);
        lijst1.addProduct("4", 4.00);
        lijst1.addProduct("5", 4.00);
        lijst1.addProduct("6", 4.00);
        Assertions.assertEquals(5, lijst1.korting());

        lijst1.addProduct("7", 4.00);
        lijst1.addProduct("8", 4.00);
        Assertions.assertEquals(5, lijst1.korting());

//        Equivalentieklasse 3: 10% korting
        lijst1.addProduct("9", 4.00);
        lijst1.addProduct("10", 4.00);
        Assertions.assertEquals(10, lijst1.korting());

        lijst1.addProduct("11", 4.00);
        lijst1.addProduct("12", 4.00);
        Assertions.assertEquals(10, lijst1.korting());
    }

    @Test
    void PairwiseTest1en2() {
        //test1
        lijst1.setLeeftijd(15);
        lijst1.setId(true);
        AlcoholDrank heineken = new AlcoholDrank("heineken", 1.5, 5.0, 10);
        lijst1.setPinnen(true);
        lijst1.voegToe(heineken);
        Assertions.assertFalse(lijst1.checkAlcohol(heineken));

        //test2
        lijst1.setId(false);
        AlcoholDrank bacardi = new AlcoholDrank("bacardi", 1.5, 5.0, 30);
        lijst1.setPinnen(false);
        Assertions.assertFalse(lijst1.checkAlcohol(heineken));
    }

    @Test
    void PairwiseTest3en4(){
        //test3
        lijst1.setLeeftijd(19);
        lijst1.setId(false);
        AlcoholDrank bacardi = new AlcoholDrank("bacardi", 1.5, 5.0, 30);
        lijst1.setPinnen(false);
        lijst1.voegToe(bacardi);
        Assertions.assertFalse(lijst1.checkAlcohol(bacardi));

        //test4
        lijst1.setId(true);
        AlcoholDrank heineken = new AlcoholDrank("heineken", 1.5, 5.0, 10);
        lijst1.setPinnen(true);
        Assertions.assertTrue(lijst1.checkAlcohol(heineken));
    }

    @Test
    void PairwiseTest5en6(){
        //test5
        lijst1.setLeeftijd(24);
        lijst1.setId(false);
        AlcoholDrank heineken = new AlcoholDrank("heineken", 1.5, 5.0, 10);
        lijst1.setPinnen(true);
        lijst1.voegToe(heineken);
        Assertions.assertFalse(lijst1.checkAlcohol(heineken));

        //test6
        lijst1.setId(true);
        AlcoholDrank bacardi = new AlcoholDrank("bacardi", 1.5, 5.0, 30);
        lijst1.setPinnen(true);
        Assertions.assertTrue(lijst1.checkAlcohol(heineken));
    }
}