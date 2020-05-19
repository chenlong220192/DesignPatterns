package site.mingsha.pattern.behaviour.state;

/**
 * @author chenlong
 * @version : State.java, v0.1 2020/5/18 Exp $$
 */
public abstract class State {
    protected Context context;
    
    public void setContext(Context context) {
        this.context = context;
    }
    
    /**
     * 行为1
     */
    public abstract void handle1();
    
    /**
     * 行为2
     */
    public abstract void handle2();
}
