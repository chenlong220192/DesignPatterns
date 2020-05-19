package site.mingsha.pattern.create.abstructfactory;

/**
 * 工厂2，只生产跳线为2的产品
 * @author chenlong
 * @version : Creator2.java, v0.1 2020/5/18 Exp $$
 */
public class Creator2 extends AbstractCreator {
    
    /**
     * 只生产产品等级为2的A产品
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
    
    /**
     * 只生产铲平等级为2的B产品
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
    
}
