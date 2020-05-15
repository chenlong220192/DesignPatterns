package site.mingsha.pattern.behaviour_pattern.strategy;

/**
 * 上下文
 * @author hjp21925
 * @version $Id: Context.java, v 0.1 2016年8月25日 下午4:39:11 hjp21925 Exp $
 */
public class Context {
    //抽象策略
    private Strategy strategy = null;
    
    //构造函数设置具体策略
    public Context(Strategy _strategy) {
        this.strategy = _strategy;
    }
    
    //封装后的策略方法
    public void doAnythinig() {
        this.strategy.doSomething();
    }
}
