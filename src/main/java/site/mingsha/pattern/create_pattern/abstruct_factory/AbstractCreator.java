package site.mingsha.pattern.create_pattern.abstruct_factory;

/**
 * 抽象的产品类
 */
public abstract class AbstractCreator {
    
    //创建A产品家族
    public abstract AbstractProductA createProductA();
    
    //创建B产品家族
    public abstract AbstractProductB createProductB();
}
