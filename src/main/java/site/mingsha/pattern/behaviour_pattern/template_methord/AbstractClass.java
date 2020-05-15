package site.mingsha.pattern.behaviour_pattern.template_methord;

/**
 *
 * @author hjp21925
 * @version $Id: AbstractClass.java, v 0.1 2016年8月25日 下午5:02:19 hjp21925 Exp $
 */
public abstract class AbstractClass {
    
    //基本方法
    protected abstract void doSomething();
    
    //基本方法
    protected abstract void doAnything();
    
    //模版方法
    public final void templateMethod() {
        /*
         * 调用基本方法，完成相关的逻辑
         */
        this.doAnything();
        this.doSomething();
        //        if (isDsomething()) {
        //            this.doSomething();
        //        }
    }
    
    //    // 钩子方法
    //    protected boolean isDsomething() {
    //        return false;
    //    }
    
}
