package Model;

public class Factory3 extends AbstractFactory{

    @Override
    public Product createFruit() {
        return new Fruit("peer", 3.00, 2);
    }

    @Override
    public Product createDrank() {
        return new Drank("Appelsap", 0.49, 0.2);
    }

    @Override
    public Product createDesert() {
        return new Desert("cupcake", 2.50, 2);
    }

    @Override
    public Product createFastFood() {
        return new Fastfood("patat", 1.99, 2);
    }
}
