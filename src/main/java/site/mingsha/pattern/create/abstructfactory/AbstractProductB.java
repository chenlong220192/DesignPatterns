package site.mingsha.pattern.create.abstructfactory;

/**
 * 产品B
 * @author chenlong
 * @version : AbstractProductB.java, v0.1 2020/5/18 Exp $$
 */
public abstract class AbstractProductB {
    
    /**
     * 每个产品共有的方法
     */
    public void shareMethod() {
    
    }
    
    /**
     * 每个产品相同方法，不同实现
     */
    public abstract void doSomething();
}
