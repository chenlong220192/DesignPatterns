package site.mingsha.pattern.behaviour_pattern.visitor;

/**
 * 具体访问者
 * @author hjp21925
 * @version $Id: Visitor.java, v 0.1 2016年8月26日 上午11:32:33 hjp21925 Exp $
 */
public class Visitor implements IVisitor {
    
    /**
     * @see site.mingsha.pattern.behaviour_pattern.visitor.IVisitor#visit(site.mingsha.pattern.behaviour_pattern.visitor.ConcreteElement1)
     */
    public void visit(ConcreteElement1 concreteElement1) {
        concreteElement1.doSomething();
    }
    
    /**
     * @see site.mingsha.pattern.behaviour_pattern.visitor.IVisitor#visit(site.mingsha.pattern.behaviour_pattern.visitor.ConcreteElement2)
     */
    public void visit(ConcreteElement2 concreteElement2) {
        concreteElement2.doSomething();
    }
    
}
