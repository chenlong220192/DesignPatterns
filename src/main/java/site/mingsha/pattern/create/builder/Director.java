package site.mingsha.pattern.create.builder;

/**
 * 指导建造过程
 * @author chenlong
 * @version : Director.java, v0.1 2020/5/18 Exp $$
 */
public class Director {
    
    /** 建造者 */
    private Builder builder = new ConcreteBuilder();
    
    /**
     * 构建不同的产品
     * @return
     */
    public Product getABProduct() {
        builder.setPartA();
        builder.setPartB();
        // 设置不同的零件，产生不同的产品
        return builder.buildProduct();
    }
    
    /**
     * 构建不同的产品
     * @return
     */
    public Product getBAProduct() {
        builder.setPartB();
        builder.setPartA();
        // 设置不同的零件，产生不同的产品
        return builder.buildProduct();
    }
    
}
