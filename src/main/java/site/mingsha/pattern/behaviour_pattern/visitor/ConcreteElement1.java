package site.mingsha.pattern.behaviour_pattern.visitor;

/**
 *
 * @author hjp21925
 * @version $Id: CommonEmployee.java, v 0.1 2016锟斤拷8锟斤拷26锟斤拷 锟斤拷锟斤拷9:50:19 hjp21925 Exp $
 */
public class ConcreteElement1 extends Element {
    
    /**
     * @see Element#doSomething()
     */
    @Override
    public void doSomething() {
        System.out.println("element1 biz...");
    }
    
    /**
     * @see Element#accept(IVisitor)
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
