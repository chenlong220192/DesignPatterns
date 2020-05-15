package site.mingsha.pattern.behaviour_pattern.command;

/**
 * 抽象接收者
 * @author hjp21925
 * @version $Id: Receiver.java, v 0.1 2016年8月25日 下午4:47:44 hjp21925 Exp $
 */
public abstract class Receiver {
    //抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
