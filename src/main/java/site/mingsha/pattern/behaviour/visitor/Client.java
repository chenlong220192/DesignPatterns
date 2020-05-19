package site.mingsha.pattern.behaviour.visitor;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            //获得元素对象
            Element el = ObjectStruture.createElement();
            //接受访问者访问
            el.accept(new Visitor());
        }
        
    }
    
}