package site.mingsha.pattern.behaviour.observer;

/**
 * @author chenlong
 * @version : ConcreteSubject.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteSubject extends Subject {
    
    /**
     * 具体的业务
     */
    public void doSomething() {
        /*
         * do something
         */
        super.notifyObserver();
    }
}
