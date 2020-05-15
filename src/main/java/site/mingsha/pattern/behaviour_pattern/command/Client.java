package site.mingsha.pattern.behaviour_pattern.command;

/**
 * 场景类
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月25日 下午4:46:59 hjp21925 Exp $
 */
public class Client {
    
    public static void main(String[] args) {
        //首先声明出调用者Invoker
        Invoker invoker = new Invoker();
        
        //定义一个发送给接收者的命令
        Command command = new ConcreteCommand1();
        
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
        
    }
    
}
