package site.mingsha.pattern.behaviour_pattern.mediator;

/**
 *
 * @author hjp21925
 * @version $Id: ConcreteMediator.java, v 0.1 2016年8月25日 下午4:44:27 hjp21925 Exp $
 */
public class ConcreteMediator extends Mediator {
    
    @Override
    public void interact() {
        //调用同事类的方法，只要是public方法都可以调用
        super.c1.communicate();
        super.c2.communicate();
    }
    
    
    
}
