package site.mingsha.pattern.behaviour.observer;


/**
 * @author chenlong
 * @version : Caretaker.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteObserver implements Observer {
    
    /**
     * 实现更新方法
     */
    @Override
    public void update() {
        System.out.println("接收到信息，并进行处理！");
    }
    
}
