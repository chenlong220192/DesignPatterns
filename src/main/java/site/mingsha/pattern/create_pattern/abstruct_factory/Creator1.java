package site.mingsha.pattern.create_pattern.abstruct_factory;

/**
 * 工厂1，只生产跳线为1的产品
 */
public class Creator1 extends AbstractCreator {
    
    //只生产产品等级为1的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
    
    //只生产铲平等级为1的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
    
}
