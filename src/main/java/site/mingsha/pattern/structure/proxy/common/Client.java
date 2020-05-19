package site.mingsha.pattern.structure.proxy.common;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
