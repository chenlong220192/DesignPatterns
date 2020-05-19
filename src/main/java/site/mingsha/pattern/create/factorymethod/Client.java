/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.create.factorymethod;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    public static void main(String[] args) {
        Factory creator = new ConcreteFactory();
        Product product1 = creator.createProduct(ConcreteProduct1.class);
        Product product2 = creator.createProduct(ConcreteProduct2.class);
        
        System.out.println(product1);
        System.out.println(product2);
        
        product1.doSomething();
        product2.doSomething();
        
        // 继续业务处理
    }
}