package site.mingsha.pattern.behaviour.chainofresponsiblity;

/**
 * @author chenlong
 * @version : ConcreteHandler2.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteHandler2 extends Handler {
    
    /**
     * 定义自己的处理逻辑
     *
     * @param request
     * @return
     */
    @Override
    protected Response echo(Request request) {
        // 完成处理逻辑
        return null;
    }
    
    /**
     * 设置自己的处理级别
     * @return
     */
    @Override
    protected Level getHandlerLevel() {
        // 设置自己的处理级别
        return null;
    }
    
}
