package Factory.SimpleFactory;

import Factory.fruit.Fruit;

public class Client {
    public static void main(String[] args){
        SimpleFactory factory = new SimpleFactory();
        /**
         * 客户传入水果名字，获得对应的水果
         */
        Fruit fruit = factory.buy("apple");
        fruit.eat();
    }
}
