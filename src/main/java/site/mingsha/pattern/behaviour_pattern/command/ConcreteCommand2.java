package site.mingsha.pattern.behaviour_pattern.command;

/**
 * 具体命令
 * @author hjp21925
 * @version $Id: ConcreteCommand2.java, v 0.1 2016年8月25日 下午4:48:34 hjp21925 Exp $
 */
public class ConcreteCommand2 extends Command {
    //声明自己的默认接收者
    public ConcreteCommand2() {
        super(new ConcreteReciver2());
    }
    
    //设置新的接收者
    public ConcreteCommand2(Receiver _receiver) {
        super(_receiver);
    }
    
    //每个具体的命令都必须实现一个命令
    @Override
    public void execute() {
        //业务处理
        super.receiver.doSomething();
    }
}
