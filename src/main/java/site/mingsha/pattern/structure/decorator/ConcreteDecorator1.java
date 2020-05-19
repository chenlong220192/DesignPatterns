package site.mingsha.pattern.structure.decorator;

/**
 * 具体装饰类
 *
 * @author chenlong
 * @version : ConcreteDecorator1.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteDecorator1 extends Decorator {
    
    /**
     * 定义被修饰者
     *
     * @param _component
     */
    public ConcreteDecorator1(Component _component) {
        super(_component);
    }
    
    /**
     * 定义自己的修饰方法
     */
    private void method1() {
        System.out.println("method1 修饰");
    }
    
    /**
     * 重写父类的Operation方法
     */
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
