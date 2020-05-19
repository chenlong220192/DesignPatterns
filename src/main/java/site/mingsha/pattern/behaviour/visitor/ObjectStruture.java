/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.behaviour.visitor;

import java.util.Random;

/**
 * @author chenlong
 * @version : ObjectStruture.java, v0.1 2020/5/18 Exp $$
 */
public class ObjectStruture {
    /**
     * 对象生成器，这里通过一个工厂方法模式模拟
     *
     * @return
     */
    public static Element createElement() {
        Random rand = new Random();
        if (rand.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
