package site.mingsha.pattern.structure.flyweight;

import java.util.HashMap;

/**
 * @author chenlong
 * @version : FlyweightFactory.java, v0.1 2020/5/18 Exp $$
 */
public class FlyweightFactory {
    /**
     * 定义一个池容器
     */
    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();
    
    /**
     * 享元工厂
     *
     * @param extrinsic
     * @return
     */
    public static Flyweight getFlyweight(String extrinsic) {
        // 需要返回的对象
        Flyweight flyweight = null;
        // 在池中没有改对象
        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            // 根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight1(extrinsic);
            // 放置到池中
            pool.put(extrinsic, flyweight);
        }
        
        return flyweight;
    }
    
}
