package site.mingsha.pattern.structure.bridge;

/**
 * @author chenlong
 * @version : Abstraction.java, v0.1 2020/5/18 Exp $$
 */
public abstract class Abstraction {
    
    /**
     * 定义对实现化角色的引用
     */
    private Implementor imp;
    
    /**
     * 约束子类必须实现该构造函数
     * @param _imp
     */
    public Abstraction(Implementor _imp) {
        this.imp = _imp;
    }
    
    /**
     * 自身的行为和属性
     */
    public void request() {
        this.imp.doSomething();
    }
    
    /**
     * 获得实现化角色
     * @return
     */
    public Implementor getImp() {
        return imp;
    }
}
