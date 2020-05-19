package site.mingsha.pattern.behaviour.observer;


/**
 * @author chenlong
 * @version : Caretaker.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    
    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 定义一个观察则
        Observer obs = new ConcreteObserver();
        // 观察者观察被被观察则
        subject.addObserver(obs);
        // 观察者开始活动了
        subject.doSomething();
    }
    
}
