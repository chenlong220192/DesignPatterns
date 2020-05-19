package site.mingsha.pattern.structure.decorator;

/**
 * 抽象装饰类
 *
 * @author chenlong
 * @version : Decorator.java, v0.1 2020/5/18 Exp $$
 */
public abstract class Decorator extends Component {
    
    private Component component = null;
    
    /**
     * 通过构造函数传递被修饰者
     *
     * @param _component
     */
    public Decorator(Component _component) {
        this.component = _component;
    }
    
    /**
     * 委托给被修饰者执行
     */
    @Override
    public void operate() {
        this.component.operate();
    }
    
}
