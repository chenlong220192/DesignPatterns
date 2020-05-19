package site.mingsha.pattern.behaviour.command;

/**
 * 抽象接收者
 *
 * @author chenlong
 * @version : ConcreteReciver2.java, v0.1 2020/5/18 Exp $$
 */
public abstract class Receiver {
    /**
     * 抽象接收者，定义每个接收者都必须完成的业务
     */
    public abstract void doSomething();
}
