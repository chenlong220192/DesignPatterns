package site.mingsha.pattern.create_pattern.factory_method;

/**
 * 具体工厂
 * @author hjp21925
 * @version $Id: Factory.java, v 0.1 2016年8月25日 下午4:19:35 hjp21925 Exp $
 */
public class ConcreteFactory extends Factory {
    @SuppressWarnings("unchecked")
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T) product;
    }
}
