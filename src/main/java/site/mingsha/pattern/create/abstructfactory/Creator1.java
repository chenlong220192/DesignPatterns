package site.mingsha.pattern.create.abstructfactory;

/**
 * 工厂1，只生产跳线为1的产品
 * @author chenlong
 * @version : Creator1.java, v0.1 2020/5/18 Exp $$
 */
public class Creator1 extends AbstractCreator {
    
    /**
     * 只生产产品等级为1的A产品
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
    
    /**
     * 只生产铲平等级为1的B产品
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
    
}
