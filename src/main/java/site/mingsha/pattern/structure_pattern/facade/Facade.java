package site.mingsha.pattern.structure_pattern.facade;

/**
 * Facade
 * @author hjp21925
 * @version $Id: Facade.java, v 0.1 2016年8月25日 下午4:51:48 hjp21925 Exp $
 */
public class Facade {
    //被委托的对象
    private ClassA  a       = new ClassA();
    private ClassB  b       = new ClassB();
    private Context context = new Context();
    
    //提供给外部访问的方法
    public void methodA() {
        this.a.doSomethingA();
    }
    
    public void methodB() {
        this.b.doSomethingB();
    }
    
    public void methodC() {
        this.context.complexMethod();
    }
}
