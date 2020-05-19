package site.mingsha.pattern.behaviour.memento;

/**
 * @author chenlong
 * @version : Originator.java, v0.1 2020/5/18 Exp $$
 */
public class Originator {
    
    /**
     * 内部状态
     */
    private String state = "";
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * 创建一个备忘录
     * @return
     */
    public IMemento createMemento() {
        return new Memento(this.state);
    }
    
    /**
     * 恢复一个备忘录
     * @param _memento
     */
    public void restoreMemento(IMemento _memento) {
        this.setState(((Memento) _memento).getState());
    }
    
    /**
     * 内置类
     */
    private class Memento implements IMemento {
        
        //发起人的内部状态
        private String state = "";
        
        //构造函数传递参数
        private Memento(String _state) {
            this.state = _state;
        }
        
        private String getState() {
            return state;
        }
        
        @SuppressWarnings("unused")
        private void setState(String state) {
            this.state = state;
        }
        
    }
    
}
