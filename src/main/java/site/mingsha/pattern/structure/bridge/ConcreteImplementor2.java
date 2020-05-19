package site.mingsha.pattern.structure.bridge;

/**
 * @author chenlong
 * @version : ConcreteImplementor2.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteImplementor2 implements Implementor {
    
    @Override
    public void doSomething() {
        // 业务逻辑处理
        System.out.println("Implementor2 doSomething...");
    }
    
    @Override
    public void doAnything() {
        // 业务逻辑处理
        System.out.println("Implementor2 doAnything...");
    }
}
