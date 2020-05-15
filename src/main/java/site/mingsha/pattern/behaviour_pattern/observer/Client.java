package site.mingsha.pattern.behaviour_pattern.observer;

/**
 *
 * @author hjp21925
 * @version $Id: Subject.java, v 0.1 2016年8月25日 下午4:41:27 hjp21925 Exp $
 */
public class Client {
    
    public static void main(String[] args) {
        //创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        //定义一个观察则
        Observer obs = new ConcreteObserver();
        //观察者观察被被观察则
        subject.addObserver(obs);
        //观察者开始活动了
        subject.doSomething();
    }
    
}
