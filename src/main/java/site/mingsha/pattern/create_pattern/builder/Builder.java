package site.mingsha.pattern.create_pattern.builder;

/**
 *
 * @author hjp21925
 * @version $Id: Builder.java, v 0.1 2016年8月25日 下午4:35:14 hjp21925 Exp $
 */
public abstract class Builder {
    
    //设置产品的不同部分，以获得不同的产品
    public abstract void setPartA();
    
    //设置产品的不同部分，以获得不同的产品
    public abstract void setPartB();
    
    //建造产品
    public abstract Product buildProduct();
}
