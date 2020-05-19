package site.mingsha.pattern.structure.decorator;

/**
 * 具体装饰类
 *
 * @author chenlong
 * @version : ConcreteDecorator2.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteDecorator2 extends Decorator {
    
    /**
     * 定义被修饰者
     *
     * @param _component
     */
    public ConcreteDecorator2(Component _component) {
        super(_component);
    }
    
    /**
     * 定义自己的修饰方法
     */
    private void method2() {
        System.out.println("method2修饰");
    }
    
    /**
     * 重写父类的Operation方法
     */
    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
