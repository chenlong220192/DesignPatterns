package site.mingsha.pattern.behaviour.templatemethord;

/**
 * @author chenlong
 * @version : ConcreteClass1.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteClass1 extends AbstractClass {
    //    private boolean isDoSomething = false;
    
    //    /**
    //     * @param isDoSomething
    //     */
    //    public ConcreteClass1(boolean isDoSomething) {
    //        super();
    //        this.isDoSomething = isDoSomething;
    //    }
    //
    //    /**
    //     *
    //     */
    //    public ConcreteClass1() {
    //    }
    
    /**
     * 实现基本方法
     */
    @Override
    protected void doAnything() {
        // 业务逻辑处理
        System.out.println("do anything...");
    }
    
    @Override
    protected void doSomething() {
        // 业务逻辑处理
        System.out.println("do something...");
    }
    
    //    @Override
    //    protected boolean isDsomething() {
    //        return this.isDoSomething;
    //    }
    
}
