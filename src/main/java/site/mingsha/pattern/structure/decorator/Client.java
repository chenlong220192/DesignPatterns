package site.mingsha.pattern.structure.decorator;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        
        // 第一次修饰
        component = new ConcreteDecorator1(component);
        
        // 第二次修饰
        component = new ConcreteDecorator2(component);
        
        // 修饰后运行
        component.operate();
        
    }
    
}
