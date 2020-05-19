package site.mingsha.pattern.structure.bridge;

/**
 * @author chenlong
 * @version : RefinedAbstraction.java, v0.1 2020/5/18 Exp $$
 */
public class RefinedAbstraction extends Abstraction {
    
    /**
     * 覆写构造函数
     *
     * @param _imp
     */
    public RefinedAbstraction(Implementor _imp) {
        super(_imp);
    }
    
    /**
     * 修正父类的行文
     */
    @Override
    public void request() {
        /*
         * 业务处理....
         */
        super.request();
        
        super.getImp().doAnything();
    }
}
