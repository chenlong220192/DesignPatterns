package site.mingsha.pattern.structure_pattern.proxy.dynamic_proxy.exampleB;

/**
 * 后置通知
 * @author hjp21925
 * @version $Id: AfterAdvice.java, v 0.1 2016年8月25日 下午7:46:50 hjp21925 Exp $
 */
public class AfterAdvice implements IAdvice {
    
    public void exec() {
        System.out.println("我是后续通知，我被执行了！");
    }
    
}
