package site.mingsha.pattern.structure.facade;

/**
 * @author chenlong
 * @version : Context.java, v0.1 2020/5/18 Exp $$
 */
public class Context {
    /**
     * 委托处理
     */
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();
    
    /**
     * 复杂的计算
     */
    public void complexMethod() {
        this.a.doSomethingA();
        this.c.doSomethingC();
    }
}
