package site.mingsha.pattern.behaviour_pattern.memento;

/**
 *
 * @author hjp21925
 * @version $Id: Caretaker.java, v 0.1 2016年8月25日 下午4:42:17 hjp21925 Exp $
 */
public class Caretaker {
    
    //备忘录对象
    private IMemento memento;
    
    public IMemento getMemento() {
        return memento;
    }
    
    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
    
}
