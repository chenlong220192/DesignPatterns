package site.mingsha.pattern.structure_pattern.proxy.common;

/**
 * 具体主题
 * @author hjp21925
 * @version $Id: RealSubject.java, v 0.1 2016年8月25日 下午4:53:03 hjp21925 Exp $
 */
public class RealSubject implements Subject {
    //发送请求
    public void request() {
        // 业务逻辑
        System.out.println("do something");
    }
}
