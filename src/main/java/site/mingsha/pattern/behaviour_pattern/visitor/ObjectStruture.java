/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.behaviour_pattern.visitor;

import java.util.Random;

/**
 * 结构对象
 * @author hjp21925
 * @version $Id: ObjectStruture.java, v 0.1 2016年8月26日 上午11:32:58 hjp21925 Exp $
 */
public class ObjectStruture {
    //对象生成器，这里通过一个工厂方法模式模拟
    public static Element createElement() {
        Random rand = new Random();
        if (rand.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
