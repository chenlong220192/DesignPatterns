package site.mingsha.pattern.create_pattern.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    
    //设置产品零件
    @Override
    public void setPartA() {
        /*
         * 产品类内的逻辑处理
         */
        System.out.println("setPartA...");
    }
    
    //设置产品零件
    @Override
    public void setPartB() {
        /*
         * 产品类内的逻辑处理
         */
        System.out.println("setPartB...");
    }
    
    //组建一个产品
    @Override
    public Product buildProduct() {
        return product;
    }
    
}
