package Factory.AbstractFactory;

import Factory.fruit.Fruit;

public class Client {
    public static void main(String[] args) {
        /**
         * 抽象工厂模式： 由于工厂方法将生产产品的逻辑交给客户端，而客户端因为所需管理的工厂过多，容易产生混乱，于是可以将苹果、橙子开发成套餐的形式，
         *   客户只选择1个套餐(工厂)，即可满足所有需求，如此以来可以给客户端提高效率。
         * 优点：
         *   1. 客户自主选择生产厂商的某个套餐，所有产品只依赖该套餐
         * 缺点：
         *   客户端在需要新的套餐时，需要重新定制1个工厂，需要增加的代码比较多。
         */
        AbstractFactory factory = new Factory1();
        Fruit apple = factory.buyApple();
        Fruit orange = factory.buyOrange();
        apple.eat();
        orange.eat();
    }
}
