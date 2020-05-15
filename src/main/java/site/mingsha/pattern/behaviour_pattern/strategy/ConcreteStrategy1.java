package site.mingsha.pattern.behaviour_pattern.strategy;

/**
 * 具体策略
 * @author hjp21925
 * @version $Id: ConcreteStrategy1.java, v 0.1 2016年8月25日 下午4:39:24 hjp21925 Exp $
 */
public class ConcreteStrategy1 implements Strategy {
    
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
    
}
