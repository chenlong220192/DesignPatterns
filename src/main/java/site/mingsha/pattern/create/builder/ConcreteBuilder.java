package site.mingsha.pattern.create.builder;

/**
 * @author chenlong
 * @version : ConcreteBuilder.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteBuilder extends Builder {
    
    private Product product = new Product();
    
    /**
     * 设置产品零件
     */
    @Override
    public void setPartA() {
        // 产品类内的逻辑处理
        System.out.println("setPartA...");
    }
    
    /**
     * 设置产品零件
     */
    @Override
    public void setPartB() {
        // 产品类内的逻辑处理
        System.out.println("setPartB...");
    }
    
    /**
     * 组建一个产品
     * @return
     */
    @Override
    public Product buildProduct() {
        return product;
    }
    
}
