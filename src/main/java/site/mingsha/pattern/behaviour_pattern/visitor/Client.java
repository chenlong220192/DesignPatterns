package site.mingsha.pattern.behaviour_pattern.visitor;

/**
 * 场景类
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月26日 上午9:50:05 hjp21925 Exp $
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