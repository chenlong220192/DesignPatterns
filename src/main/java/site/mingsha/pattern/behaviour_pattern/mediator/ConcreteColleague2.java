package site.mingsha.pattern.behaviour_pattern.mediator;

/**
 * @author hjp21925
 * @version $Id: ConcreteColleague2.java, v 0.1 2016年8月25日 下午4:44:33 hjp21925 Exp $
 */
public class ConcreteColleague2 extends Colleague {
    
    //通过构造函数传递中介者
    public ConcreteColleague2(Mediator _mediator) {
        super(_mediator);
    }
    
    //自有方法 self-method
    public void communicate() {
        //处理自己的业务逻辑
        System.out.println("c2 selfThing...");
    }
    
    //依赖方法 dep-method
    public void interact() {
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.interact();
    }
    
}
