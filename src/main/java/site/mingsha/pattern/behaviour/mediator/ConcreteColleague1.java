package site.mingsha.pattern.behaviour.mediator;

/**
 * @author chenlong
 * @version : ConcreteColleague1.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteColleague1 extends Colleague {
    
    /**
     * 通过构造函数传递中介者
     *
     * @param _mediator
     */
    public ConcreteColleague1(Mediator _mediator) {
        super(_mediator);
    }
    
    /**
     * 自有方法 self-method
     */
    public void communicate() {
        // 处理自己的业务逻辑
        System.out.println("c1 selfthing...");
    }
    
    /**
     * 依赖方法 dep-method
     */
    public void interact() {
        // 处理自己的业务逻辑
        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.interact();
        
    }
    
    
}
