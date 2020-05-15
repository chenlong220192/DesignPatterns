package site.mingsha.pattern.behaviour_pattern.observer;

import java.util.Vector;

/**
 *
 * @author hjp21925
 * @version $Id: Subject.java, v 0.1 2016年8月25日 下午4:41:27 hjp21925 Exp $
 */
public abstract class Subject {
    //定一个一个观察者数组
    private Vector<Observer> obsVector = new Vector<Observer>();
    
    //增加一个观察者
    public void addObserver(Observer o) {
        this.obsVector.add(o);
    }
    
    //删除一个观察者
    public void delObserver(Observer o) {
        this.obsVector.remove(o);
    }
    
    //通知所有观察者
    public void notifyObserver() {
        for (Observer o : this.obsVector) {
            o.update();
        }
    }
}
