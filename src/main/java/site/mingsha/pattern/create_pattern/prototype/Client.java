/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.create_pattern.prototype;

/**
 * 场景类
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月25日 下午8:17:35 hjp21925 Exp $
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
