package Factory.fruit.orange;

import Factory.fruit.Fruit;

public class BigOrange implements Fruit {
    @Override
    public void eat(){
        System.out.println("吃大橙子！");
    }
}
