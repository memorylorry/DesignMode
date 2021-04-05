package Factory.FactoryMethod;

import Factory.FactoryMethod.apple.BigAppleFactory;
import Factory.fruit.Fruit;

public class Client1 {
    public static void main(String[] args) {
        /**
         * 工厂方法模式：
         *   为了解决简单工厂在增加产品时，需要更改工厂类，这违背了开闭原则，于是将选择产品的逻辑抽出来由客户端决定。
         * 场景：
         *   客户1需要大苹果，在寻找工厂时，指定大苹果的工厂即可。
         * 优点：
         *   工厂方法将选择生产品类型的逻辑，放到了客户端。因此在增加产品时，只需要增加工厂类即可；而客户端可以结合自己需要去选择。
         * 缺点：
         *   用户需要记住所有要用的具体工厂类名。倘若客户1经常吃大苹果、小橙子，那每次去购物时，要去这2个工厂购买，会花销许多的时间在路上；
         *   那么如果客户需要记住100个工厂名呢？是不是都要崩溃了？为了解决这个问题，引入抽象工厂，请看下一个部分。
         */
        FactoryMethod factory = new BigAppleFactory();
        Fruit apple = factory.buy();
        apple.eat();
    }
}
