package site.mingsha.pattern.behaviour.mediator;

/**
 * @author chenlong
 * @version : ConcreteMediator.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteMediator extends Mediator {
    
    /**
     *
     */
    @Override
    public void interact() {
        // 调用同事类的方法，只要是public方法都可以调用
        super.c1.communicate();
        super.c2.communicate();
    }
    
    
}
