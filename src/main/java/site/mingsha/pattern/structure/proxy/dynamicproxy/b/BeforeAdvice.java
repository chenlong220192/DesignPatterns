package site.mingsha.pattern.structure.proxy.dynamicproxy.b;

/**
 * 前置通知
 *
 * @author chenlong
 * @version : BeforeAdvice.java, v0.1 2020/5/18 Exp $$
 */
public class BeforeAdvice implements IAdvice {
    
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
