package Model;

public abstract class AbstractFactory {
    public Product createProduct(String type) {
        return switch (type) {
            case "Fruit" -> createFruit();
            case "Desert" -> createDesert();
            case "Fastfood" -> createFastfood();
            default -> null;
        };
    }
    public abstract Product createFruit();
    public abstract Product createDesert();
    public abstract Product createFastfood();
}
