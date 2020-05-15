package site.mingsha.pattern.behaviour_pattern.template_methord;

/**
 *
 * @author hjp21925
 * @version $Id: ConcreteClass1.java, v 0.1 2016年8月25日 下午5:02:39 hjp21925 Exp $
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
    
    //实现基本方法
    @Override
    protected void doAnything() {
        //业务逻辑处理
        System.out.println("do anything...");
    }
    
    @Override
    protected void doSomething() {
        //业务逻辑处理
        System.out.println("do something...");
    }
    
    //    @Override
    //    protected boolean isDsomething() {
    //        return this.isDoSomething;
    //    }
    
}
