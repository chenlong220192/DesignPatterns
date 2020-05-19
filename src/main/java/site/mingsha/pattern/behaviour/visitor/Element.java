package site.mingsha.pattern.behaviour.visitor;

/**
 * @author chenlong
 * @version : Element.java, v0.1 2020/5/18 Exp $$
 */
public abstract class Element {
    /**
     * 自身业务逻辑
     */
    public abstract void doSomething();
    
    /**
     * 允许访问者访问
     *
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);
}
