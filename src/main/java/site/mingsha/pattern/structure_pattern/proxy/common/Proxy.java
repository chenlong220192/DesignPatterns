package site.mingsha.pattern.structure_pattern.proxy.common;

/**
 * 代理
 * @author hjp21925
 * @version $Id: Proxy.java, v 0.1 2016年8月25日 下午7:42:10 hjp21925 Exp $
 */
public class Proxy implements Subject {
    //被代理对象
    private Subject subject = null;

    //构造函数
    public Proxy() {
        this.subject = new RealSubject();
    }

    //构造函数
    public Proxy(Subject _subject) {
        this.subject = _subject;
    }

    //构造函数
    public Proxy(Object... objects) {
    }

    //request
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    //before
    private void before() {
        System.out.println("befor");
        //do something
    }

    //after
    private void after() {
        System.out.println("after");
        //do something
    }
}