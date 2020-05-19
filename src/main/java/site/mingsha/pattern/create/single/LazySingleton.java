package site.mingsha.pattern.create.single;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class LazySingleton {
    /**
     * singleton
     */
    private static final LazySingleton singleton = new LazySingleton();
    
    /**
     * 私有构造函数<br>
     */
    private LazySingleton() {
    
    }
    
    /**
     * 获取单例<br>
     * @return LazySingleton
     */
    public static LazySingleton getSingleton() {
        return singleton;
    }
    
    /**
     * doSomething
     */
    public void doSomething() {
        // biz
        System.out.println("doSomething...");
    }
}
