package site.mingsha.pattern.behaviour.visitor;

/**
 * @author chenlong
 * @version : IVisitor.java, v0.1 2020/5/18 Exp $$
 */
public interface IVisitor {
    
    /**
     * 访问对象
     *
     * @param concreteElement1
     */
    void visit(ConcreteElement1 concreteElement1);
    
    /**
     * 访问对象
     *
     * @param concreteElement2
     */
    void visit(ConcreteElement2 concreteElement2);
    
}
