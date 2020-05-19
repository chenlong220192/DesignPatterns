package site.mingsha.pattern.behaviour.command;

/**
 * 具体接收者
 *
 * @author chenlong
 * @version : ConcreteReciver1.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteReciver1 extends Receiver {
    
    /**
     * 每个接受者都必须处理一定的业务逻辑
     */
    @Override
    public void doSomething() {
        System.out.println("c1:接受到指令，开始执行...");
    }
}
