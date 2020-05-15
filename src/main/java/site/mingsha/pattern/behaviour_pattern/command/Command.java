package site.mingsha.pattern.behaviour_pattern.command;

/**
 * 抽象命令
 * @author hjp21925
 * @version $Id: Command.java, v 0.1 2016年8月25日 下午4:48:58 hjp21925 Exp $
 */
public abstract class Command {
    //定义一个子类的全局共享变量
    protected final Receiver receiver;
    
    //实现类必须定义一个接收者
    public Command(Receiver _receiver) {
        this.receiver = _receiver;
    }
    
    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
