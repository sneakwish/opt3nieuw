package Model;

import Controller.HelloController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Seeder extends HelloController {
    Factory1 fact1 = new Factory1();
    Factory2 fact2 = new Factory2();
    Factory3 fact3 = new Factory3();
    public ObservableList<Product> fruitLijst(){
        ObservableList<Product> lijst = FXCollections.observableArrayList();
        lijst.add(fact1.createProduct("Fruit"));
        lijst.add(fact2.createProduct("Fruit"));
        lijst.add(fact3.createProduct("Fruit"));
        return lijst;
    }

    public ObservableList<Product> drankLijst(){
        ObservableList<Product> lijst = FXCollections.observableArrayList();
        lijst.add(fact1.createProduct("Drank"));
        lijst.add(fact2.createProduct("Drank"));
        lijst.add(fact3.createProduct("Drank"));
        return lijst;
    }

    public ObservableList<Product> desertLijst(){
        ObservableList<Product> lijst = FXCollections.observableArrayList();
        lijst.add(fact1.createProduct("Desert"));
        lijst.add(fact2.createProduct("Desert"));
        lijst.add(fact3.createProduct("Desert"));
        return lijst;
    }

    public ObservableList<Product> fastfoodLijst(){
        ObservableList<Product> lijst = FXCollections.observableArrayList();
        lijst.add(fact1.createProduct("FastFood"));
        lijst.add(fact2.createProduct("FastFood"));
        lijst.add(fact3.createProduct("FastFood"));
        return lijst;
    }
}
