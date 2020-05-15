/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.create_pattern.factory_method;

/**
 *
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月25日 下午4:23:50 hjp21925 Exp $
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
        /*
         * 继续业务处理
         */
    }
}