package site.mingsha.pattern.behaviour.strategy;

/**
 * @author chenlong
 * @version : ConcreteStrategy1.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteStrategy1 implements Strategy {
    
    /**
     *
     */
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
    
}
