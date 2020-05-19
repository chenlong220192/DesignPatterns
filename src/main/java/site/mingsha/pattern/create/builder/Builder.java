package site.mingsha.pattern.create.builder;

/**
 * @author chenlong
 * @version : Builder.java, v0.1 2020/5/18 Exp $$
 */
public abstract class Builder {
    
    /**
     * 设置产品的不同部分，以获得不同的产品
     */
    public abstract void setPartA();
    
    /**
     * 设置产品的不同部分，以获得不同的产品
     */
    public abstract void setPartB();
    
    /**
     * 建造产品
     * @return
     */
    public abstract Product buildProduct();
}
