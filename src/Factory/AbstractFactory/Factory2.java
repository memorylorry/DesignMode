package Factory.AbstractFactory;

import Factory.fruit.Fruit;
import Factory.fruit.apple.BigApple;
import Factory.fruit.apple.SmallApple;

public class Factory2 implements AbstractFactory {
    @Override
    public Fruit buyApple() {
        return new SmallApple();
    }

    @Override
    public Fruit buyOrange() {
        return new BigApple();
    }
}
