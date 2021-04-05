package Factory.fruit.apple;

import Factory.fruit.Fruit;

public class BigApple implements Fruit {
    @Override
    public void eat(){
        System.out.println("吃大苹果！");
    }
}
