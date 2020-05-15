package site.mingsha.pattern.structure_pattern.proxy.dynamic_proxy.exampleB;

/**
 * 前置通知
 * @author hjp21925
 * @version $Id: BeforeAdvice.java, v 0.1 2016年8月25日 下午7:47:07 hjp21925 Exp $
 */
public class BeforeAdvice implements IAdvice {
    
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
