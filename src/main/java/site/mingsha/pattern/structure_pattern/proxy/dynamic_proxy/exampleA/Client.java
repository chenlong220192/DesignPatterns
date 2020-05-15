package site.mingsha.pattern.structure_pattern.proxy.dynamic_proxy.exampleA;

/**
 * 场景类
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月25日 下午7:44:48 hjp21925 Exp $
 */
public class Client {
    
    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy(new RealSubject());
        String[] str = { "1111" };
        proxy.exec("doSomething", str);
        
    }
}
