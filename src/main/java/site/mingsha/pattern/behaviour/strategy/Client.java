package site.mingsha.pattern.behaviour.strategy;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    
    public static void main(String[] args) {
        // 声明出一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        // 声明出上下文对象
        Context context = new Context(strategy);
        // 执行封装后的方法
        context.doAnythinig();
    }
    
}
