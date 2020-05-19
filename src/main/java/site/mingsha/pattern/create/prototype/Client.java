/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.create.prototype;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    public static void main(String[] args) {
        PrototypeClass prototypeClass = new PrototypeClass();
        PrototypeClass prototypeClassCopy = prototypeClass.clone();
        System.out.println(prototypeClass);
        System.out.println(prototypeClassCopy);
        System.out.println(prototypeClass == prototypeClassCopy);
    }
}
