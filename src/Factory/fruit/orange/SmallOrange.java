package Factory.fruit.orange;

import Factory.fruit.Fruit;

public class SmallOrange implements Fruit {
    @Override
    public void eat(){
        System.out.println("吃小橙子！");
    }
}
