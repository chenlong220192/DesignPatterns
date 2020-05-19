package site.mingsha.pattern.behaviour.state;

/**
 * @author chenlong
 * @version : Subject.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    
    public static void main(String[] args) {
        // 定义环境角色
        Context context = new Context();
        // 初始化状态
        context.setCurrentState(new ConcreteState1());
        // 行为执行
        context.handle1();
        context.handle2();
        
    }
}
