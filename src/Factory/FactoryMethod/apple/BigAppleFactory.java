package Factory.FactoryMethod.apple;

import Factory.FactoryMethod.FactoryMethod;
import Factory.fruit.apple.BigApple;
import Factory.fruit.Fruit;

public class BigAppleFactory implements FactoryMethod {
    public Fruit buy(){
        return new BigApple();
    }
}
