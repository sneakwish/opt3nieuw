package Model;

public abstract class AbstractFactory extends Seeder {
//    public static final FruitFactory FRUIT_FACTORY = new FruitFactory();
//    public static final DrankFactory DRANK_FACTORY;
//    public static final DesertFactory DESERT_FACTORY;

    public Product createProduct(String productType) {

        if(productType.equals("Fruit"))
            return createFruit();
        if(productType.equals("Drank"))
            return createDrank();
        if(productType.equals("Desert"))
            return createDesert();
        if(productType.equals("FastFood"))
            return createFastFood();
        else{
            return null;
        }
    }
    public abstract Product createFruit();
    public abstract Product createDrank();
    public abstract Product createDesert();
    public abstract Product createFastFood();

}
