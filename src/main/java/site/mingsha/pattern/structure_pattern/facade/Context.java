package site.mingsha.pattern.structure_pattern.facade;

/**
 *
 * @author hjp21925
 * @version $Id: Context.java, v 0.1 2016年8月25日 下午4:52:01 hjp21925 Exp $
 */
public class Context {
    //委托处理
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();
    
    //复杂的计算
    public void complexMethod() {
        this.a.doSomethingA();
        this.c.doSomethingC();
    }
}
