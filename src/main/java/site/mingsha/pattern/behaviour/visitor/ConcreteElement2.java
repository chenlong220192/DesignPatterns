package site.mingsha.pattern.behaviour.visitor;
/**
 * @author chenlong
 * @version : ConcreteElement2.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteElement2 extends Element {
    
    @Override
    public void doSomething() {
        System.out.println("element2 biz...");
    }
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
