package Factory.FactoryMethod.apple;

import Factory.FactoryMethod.FactoryMethod;
import Factory.fruit.Fruit;
import Factory.fruit.apple.SmallApple;

public class SmallAppleFactory implements FactoryMethod {
    public Fruit buy(){
        return new SmallApple();
    }
}
