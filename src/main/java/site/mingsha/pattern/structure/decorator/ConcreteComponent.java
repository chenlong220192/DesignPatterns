package site.mingsha.pattern.structure.decorator;

/**
 * 具体构件（被装饰的类）
 *
 * @author chenlong
 * @version : ConcreteComponent.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteComponent extends Component {
    
    /**
     * 具体实现
     */
    @Override
    public void operate() {
        System.out.println("do Something");
    }
    
}
