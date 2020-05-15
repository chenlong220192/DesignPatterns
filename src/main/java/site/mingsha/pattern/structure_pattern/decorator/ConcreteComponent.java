package site.mingsha.pattern.structure_pattern.decorator;

/**
 * 具体构件（被装饰的类）
 * @author Administrator
 *
 */
public class ConcreteComponent extends Component {
    
    //具体实现
    @Override
    public void operate() {
        System.out.println("do Something");
    }
    
}
