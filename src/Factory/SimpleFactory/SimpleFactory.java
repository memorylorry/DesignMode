package Factory.SimpleFactory;

import Factory.fruit.Fruit;
import Factory.fruit.apple.BigApple;
import Factory.fruit.orange.BigOrange;

public class SimpleFactory {
    /**
     * 简单工厂模式
     * 按照客户给定的fruitName，提供相应的水果。
     * 优点：实现简单。
     * 缺点：
     *   1.工厂想生产新的水果时，需要增加对应的`水果类`和修改`SimpleFactory`
     *   2.客户不知道有哪些水果可以选购，需要看简单工厂的购买函数、api
     */
    public Fruit buy(String fruitName){
        switch (fruitName){
            case "apple":
                return new BigApple();
            case "orange":
                return new BigOrange();
        }
        return null;
    }
}
