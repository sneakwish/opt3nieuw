package Model;

public class Factory1 extends AbstractFactory{

    @Override
    public Product createFruit() {
        return new Fruit("Banaan", 1.00, 1);
    }

    @Override
    public Product createDrank() {
        return new Drank("Cola", 1.00,  0.5);
    }

    @Override
    public Product createDesert() {
        return new Desert("appeltaart", 11.00, 20);
    }

    @Override
    public Product createFastFood() {
        return new Fastfood("pizza", 15.00, 20);
    }
}
