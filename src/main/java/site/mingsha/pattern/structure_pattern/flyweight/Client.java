/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.structure_pattern.flyweight;

/**
 *
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月26日 下午2:06:44 hjp21925 Exp $
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
