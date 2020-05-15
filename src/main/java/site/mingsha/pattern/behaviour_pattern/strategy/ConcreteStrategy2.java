package site.mingsha.pattern.behaviour_pattern.strategy;

/**
 * 具体策略
 * @author hjp21925
 * @version $Id: ConcreteStrategy2.java, v 0.1 2016年8月25日 下午4:39:18 hjp21925 Exp $
 */
public class ConcreteStrategy2 implements Strategy {
    
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
    
}
