package site.mingsha.pattern.behaviour_pattern.command;

/**
 * 具体接受者
 * @author hjp21925
 * @version $Id: ConcreteReciver2.java, v 0.1 2016年8月25日 下午4:48:07 hjp21925 Exp $
 */
public class ConcreteReciver2 extends Receiver {
    
    //每个接受者都必须处理一定的业务逻辑
    @Override
    public void doSomething() {
        System.out.println("c2:接受到指令，开始执行...");
    }
}
