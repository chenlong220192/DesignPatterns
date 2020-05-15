package site.mingsha.pattern.behaviour_pattern.observer;

/**
 *
 * @author hjp21925
 * @version $Id: Subject.java, v 0.1 2016年8月25日 下午4:41:27 hjp21925 Exp $
 */
public class ConcreteObserver implements Observer {
    
    //实现更新方法
    public void update() {
        System.out.println("接收到信息，并进行处理！");
    }
    
}
