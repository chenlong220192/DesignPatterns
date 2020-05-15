package site.mingsha.pattern.create_pattern.builder;

/**
 * 指导建造过程
 * @author hjp21925
 * @version $Id: Director.java, v 0.1 2016年8月25日 下午6:04:16 hjp21925 Exp $
 */
public class Director {
    
    /** 建造者 */
    private Builder builder = new ConcreteBuilder();
    
    //构建不同的产品
    public Product getABProduct() {
        builder.setPartA();
        builder.setPartB();
        /*
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }
    
    //构建不同的产品
    public Product getBAProduct() {
        builder.setPartB();
        builder.setPartA();
        /*
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }
    
}
