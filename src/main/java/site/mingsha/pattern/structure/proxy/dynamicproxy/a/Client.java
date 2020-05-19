package site.mingsha.pattern.structure.proxy.dynamicproxy.a;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    
    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy(new RealSubject());
        String[] str = {"1111"};
        proxy.exec("doSomething", str);
        
    }
}
