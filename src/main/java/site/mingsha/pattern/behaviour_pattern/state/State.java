package site.mingsha.pattern.behaviour_pattern.state;

/**
 * 状态接口
 * @author hjp21925
 * @version $Id: State.java, v 0.1 2016年8月26日 下午1:33:41 hjp21925 Exp $
 */
public abstract class State {
    protected Context context;
    
    public void setContext(Context context) {
        this.context = context;
    }
    
    // 行为1
    public abstract void handle1();
    
    // 行为2
    public abstract void handle2();
}
