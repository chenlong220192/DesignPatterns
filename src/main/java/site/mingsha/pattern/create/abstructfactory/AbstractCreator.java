package site.mingsha.pattern.create.abstructfactory;

/**
 * 抽象的产品类
 * @author chenlong
 * @version : AbstractCreator.java, v0.1 2020/5/18 Exp $$
 */
public abstract class AbstractCreator {
    
    /**
     * 创建A产品家族
     *
     * @return
     */
    public abstract AbstractProductA createProductA();
    
    /**
     * 创建B产品家族
     *
     * @return
     */
    public abstract AbstractProductB createProductB();
}
