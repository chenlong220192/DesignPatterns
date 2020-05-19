package site.mingsha.pattern.structure.proxy.dynamicproxy.b;

/**
 * 后置通知
 *
 * @author chenlong
 * @version : AfterAdvice.java, v0.1 2020/5/18 Exp $$
 */
public class AfterAdvice implements IAdvice {
    
    @Override
    public void exec() {
        System.out.println("我是后续通知，我被执行了！");
    }
    
}
