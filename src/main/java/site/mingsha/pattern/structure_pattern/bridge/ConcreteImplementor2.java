package site.mingsha.pattern.structure_pattern.bridge;

public class ConcreteImplementor2 implements Implementor {
    
    public void doSomething() {
        //业务逻辑处理
        System.out.println("Implementor2 doSomething...");
    }
    
    public void doAnything() {
        //业务逻辑处理
        System.out.println("Implementor2 doAnything...");
    }
}
