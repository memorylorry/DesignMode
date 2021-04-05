package Factory.FactoryMethod.orange;

import Factory.FactoryMethod.FactoryMethod;
import Factory.fruit.Fruit;
import Factory.fruit.orange.SmallOrange;

public class SmallOrangeFactory implements FactoryMethod {
    public Fruit buy(){
        return new SmallOrange();
    }
}
