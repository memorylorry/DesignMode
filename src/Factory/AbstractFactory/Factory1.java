package Factory.AbstractFactory;

import Factory.fruit.Fruit;
import Factory.fruit.apple.BigApple;
import Factory.fruit.orange.SmallOrange;

public class Factory1 implements AbstractFactory {
    @Override
    public Fruit buyApple() {
        return new BigApple();
    }

    @Override
    public Fruit buyOrange() {
        return new SmallOrange();
    }
}
