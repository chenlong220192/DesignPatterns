/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.create_pattern.builder;

/**
 *
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月25日 下午6:05:14 hjp21925 Exp $
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.getABProduct();
        System.out.println("----------");
        director.getBAProduct();
    }
}
