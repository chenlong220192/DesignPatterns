package site.mingsha.pattern.create.single;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public final class HungrySingleton {
    /**.
     * 单例
     */
    private static HungrySingleton singleton = null;
    
    /**.
     * 私有构造函数<br>
     */
    private HungrySingleton() {
    }
    
    /**.
     * 获取单例<br>
     * @return HungrySingleton
     */
    public synchronized static HungrySingleton getSingleton() {
        if (singleton == null) {
            singleton = new HungrySingleton();
        }
        return singleton;
    }
    
    /**
     * 业务逻辑
     */
    public void doSomething() {
        System.out.println("doSomething...");
    }
}
