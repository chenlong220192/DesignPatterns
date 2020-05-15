package site.mingsha.pattern.behaviour_pattern.strategy;

/**
 * 场景类
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月25日 下午4:39:31 hjp21925 Exp $
 */
public class Client {
    
    public static void main(String[] args) {
        //声明出一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        //声明出上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.doAnythinig();
    }
    
}
