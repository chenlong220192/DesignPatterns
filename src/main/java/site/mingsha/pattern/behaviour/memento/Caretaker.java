package site.mingsha.pattern.behaviour.memento;

/**
 * @author chenlong
 * @version : Caretaker.java, v0.1 2020/5/18 Exp $$
 */
public class Caretaker {
    
    /**
     * 备忘录对象
     */
    private IMemento memento;
    
    public IMemento getMemento() {
        return memento;
    }
    
    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
    
}
