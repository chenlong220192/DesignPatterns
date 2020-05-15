package site.mingsha.pattern.behaviour_pattern.command;

/**
 *
 * @author hjp21925
 * @version $Id: Invoker.java, v 0.1 2016年8月25日 下午4:47:56 hjp21925 Exp $
 */
public class Invoker {
    private Command command;
    
    //接受命令
    public void setCommand(Command _command) {
        this.command = _command;
    }
    
    //执行命令
    public void action() {
        this.command.execute();
    }
    
}
