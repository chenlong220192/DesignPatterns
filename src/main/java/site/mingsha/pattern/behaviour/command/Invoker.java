package site.mingsha.pattern.behaviour.command;

/**
 * 具体接收者
 *
 * @author chenlong
 * @version : ConcreteReciver2.java, v0.1 2020/5/18 Exp $$
 */
public class Invoker {
    private Command command;
    
    /**
     * 接受命令
     * @param _command
     */
    public void setCommand(Command _command) {
        this.command = _command;
    }
    
    /**
     * 执行命令
     */
    public void action() {
        this.command.execute();
    }
    
}
