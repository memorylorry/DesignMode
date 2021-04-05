package Factory.FactoryMethod.orange;

import Factory.FactoryMethod.FactoryMethod;
import Factory.fruit.Fruit;
import Factory.fruit.orange.BigOrange;

public class BigOrangeFactory implements FactoryMethod {
    public Fruit buy(){
        return new BigOrange();
    }
}
