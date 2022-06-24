package Model;

public class Factory2 extends AbstractFactory{

    @Override
    public Product createFruit() {
        return new Fruit("appel", 2.50, 4);
    }

    @Override
    public Product createDrank() {
        return new Drank("Fanta", 2.49, 0.5);
    }

    @Override
    public Product createDesert() {
        return new Desert("slagroomijs", 6.50, 6);
    }

    @Override
    public Product createFastFood() {
        return new Fastfood("frikandel", 2.50, 5);
    }
}
