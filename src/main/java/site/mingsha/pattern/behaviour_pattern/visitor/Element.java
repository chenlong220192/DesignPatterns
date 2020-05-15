package site.mingsha.pattern.behaviour_pattern.visitor;

/**
 *
 * @author hjp21925
 * @version $Id: Employee.java, v 0.1 2016年8月26日 上午9:50:28 hjp21925 Exp $
 */
public abstract class Element {
    // 自身业务逻辑
    public abstract void doSomething();
    
    // 允许访问者访问
    public abstract void accept(IVisitor visitor);
}
