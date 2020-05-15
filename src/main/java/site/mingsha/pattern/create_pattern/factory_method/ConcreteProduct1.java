package site.mingsha.pattern.create_pattern.factory_method;

/**
 *
 * @author hjp21925
 * @version $Id: ConcreteProduct1.java, v 0.1 2016年8月25日 下午4:20:06 hjp21925 Exp $
 */
public class ConcreteProduct1 extends Product {
    
    @Override
    public void doSomething() {
        //逻辑处理
        System.out.println("do someThing...");
    }
    
}
