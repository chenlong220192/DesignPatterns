package site.mingsha.pattern.create.abstructfactory;

/**
 * 产品A
 * @author chenlong
 * @version : AbstractProductA.java, v0.1 2020/5/18 Exp $$
 */
public abstract class AbstractProductA {
    
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
