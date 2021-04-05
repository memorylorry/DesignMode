package Factory.fruit.apple;

import Factory.fruit.Fruit;

public class SmallApple implements Fruit {
    @Override
    public void eat(){
        System.out.println("吃小苹果！");
    }
}
