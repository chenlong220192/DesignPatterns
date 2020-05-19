package site.mingsha.pattern.create.factorymethod;

/**
 * 具体工厂
 * @author chenlong
 * @version : ConcreteFactory.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteFactory extends Factory {
    
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }
        return (T) product;
    }
}
