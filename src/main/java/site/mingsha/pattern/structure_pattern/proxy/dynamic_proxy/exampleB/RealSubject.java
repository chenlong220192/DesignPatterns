package site.mingsha.pattern.structure_pattern.proxy.dynamic_proxy.exampleB;

/**
 *
 * @author hjp21925
 * @version $Id: RealSubject.java, v 0.1 2016年8月25日 下午7:47:39 hjp21925 Exp $
 */
public class RealSubject implements Subject {
    
    //业务操作
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
    
}
