package site.mingsha.pattern.structure_pattern.bridge;

public class ConcreteImplementor1 implements Implementor {
    
    public void doSomething() {
        //业务逻辑处理
        System.out.println("Implementor1 doSomething...");
    }
    
    public void doAnything() {
        //业务逻辑处理
        System.out.println("Implementor1 doAnything...");
    }
}
