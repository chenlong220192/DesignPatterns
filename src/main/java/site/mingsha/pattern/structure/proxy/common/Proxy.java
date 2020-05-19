package site.mingsha.pattern.structure.proxy.common;

/**
 * 代理
 *
 * @author chenlong
 * @version : Proxy.java, v0.1 2020/5/18 Exp $$
 */
public class Proxy implements Subject {
    /**
     * 被代理对象
     */
    private Subject subject = null;
    
    /**
     * 构造函数
     */
    public Proxy() {
        this.subject = new RealSubject();
    }
    
    /**
     * 构造函数
     *
     * @param _subject
     */
    public Proxy(Subject _subject) {
        this.subject = _subject;
    }
    
    /**
     * 构造函数
     *
     * @param objects
     */
    public Proxy(Object... objects) {
    }
    
    /**
     * request
     */
    
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
    
    /**
     * before
     */
    private void before() {
        System.out.println("befor");
        // do something
    }
    
    /**
     * after
     */
    private void after() {
        System.out.println("after");
        // do something
    }
}