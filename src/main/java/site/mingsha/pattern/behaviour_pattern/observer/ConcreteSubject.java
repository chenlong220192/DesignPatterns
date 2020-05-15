package site.mingsha.pattern.behaviour_pattern.observer;

/**
 *
 * @author hjp21925
 * @version $Id: Subject.java, v 0.1 2016年8月25日 下午4:41:27 hjp21925 Exp $
 */
public class ConcreteSubject extends Subject {
    
    //具体的业务
    public void doSomething() {
        /*
         * do something
         */
        super.notifyObserver();
    }
}
