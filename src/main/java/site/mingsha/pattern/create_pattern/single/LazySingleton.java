package site.mingsha.pattern.create_pattern.single;

/**
 * 单例
 * @author hjp21925
 *
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
