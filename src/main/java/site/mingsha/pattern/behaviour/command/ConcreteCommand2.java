package site.mingsha.pattern.behaviour.command;

/**
 * 具体命令
 *
 * @author chenlong
 * @version : ConcreteCommand2.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteCommand2 extends Command {
    /**
     * 声明自己的默认接收者
     */
    public ConcreteCommand2() {
        super(new ConcreteReciver2());
    }
    
    /**
     * 设置新的接收者
     * @param _receiver
     */
    public ConcreteCommand2(Receiver _receiver) {
        super(_receiver);
    }
    
    /**
     * 每个具体的命令都必须实现一个命令
     */
    @Override
    public void execute() {
        //业务处理
        super.receiver.doSomething();
    }
}
