package site.mingsha.pattern.behaviour.visitor;

/**
 * @author chenlong
 * @version : IVisitor.java, v0.1 2020/5/18 Exp $$
 */
public class Visitor implements IVisitor {
    
    /**
     * @param concreteElement1
     */
    @Override
    public void visit(ConcreteElement1 concreteElement1) {
        concreteElement1.doSomething();
    }
    
    /**
     * @param concreteElement2
     */
    @Override
    public void visit(ConcreteElement2 concreteElement2) {
        concreteElement2.doSomething();
    }
    
}
