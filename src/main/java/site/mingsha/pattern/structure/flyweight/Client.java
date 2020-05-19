/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.structure.flyweight;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    public static void main(String[] args) {
        Flyweight flyweight = FlyweightFactory.getFlyweight("extrinsic");
        flyweight.setIntrinsic("intrinsic");
        // 
        System.out.println(flyweight.getIntrinsic() + "---" + flyweight.getExtrinsic());
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("extrinsic");
        flyweight.setIntrinsic("intrinsic2");
        System.out.println(flyweight.getIntrinsic() + "---" + flyweight.getExtrinsic());
        System.out.println(flyweight);
        System.out.println(flyweight2);
    }
}
