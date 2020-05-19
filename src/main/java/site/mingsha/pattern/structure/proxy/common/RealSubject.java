package site.mingsha.pattern.structure.proxy.common;

/**
 * 具体主题
 *
 * @author chenlong
 * @version : RealSubject.java, v0.1 2020/5/18 Exp $$
 */
public class RealSubject implements Subject {
    /**
     * 发送请求
     */
    @Override
    public void request() {
        // 业务逻辑
        System.out.println("do something");
    }
}
