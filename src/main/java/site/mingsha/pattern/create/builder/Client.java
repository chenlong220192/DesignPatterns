/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.create.builder;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.getABProduct();
        System.out.println("----------");
        director.getBAProduct();
    }
}
