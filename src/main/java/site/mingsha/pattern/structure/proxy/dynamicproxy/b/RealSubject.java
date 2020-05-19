package site.mingsha.pattern.structure.proxy.dynamicproxy.b;


/**
 * @author chenlong
 * @version : RealSubject.java, v0.1 2020/5/18 Exp $$
 */
public class RealSubject implements Subject {
    
    /**
     * 业务操作
     *
     * @param str
     */
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
    
}
