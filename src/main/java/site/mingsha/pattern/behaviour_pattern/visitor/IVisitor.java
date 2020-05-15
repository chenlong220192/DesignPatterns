package site.mingsha.pattern.behaviour_pattern.visitor;

public interface IVisitor {
    
    // 访问对象
    public void visit(ConcreteElement1 concreteElement1);
    
    // 访问对象
    public void visit(ConcreteElement2 concreteElement2);
    
}
