package site.mingsha.pattern.create_pattern.abstruct_factory;

/**
 * 场景类
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月25日 下午4:15:49 hjp21925 Exp $
 */
public class Client {
    
    public static void main(String[] args) {
        //定义出两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        
        //产生A1对象
        AbstractProductA a1 = creator1.createProductA();
        
        //产生A2对象
        AbstractProductA a2 = creator2.createProductA();
        
        //产生B1对象
        AbstractProductB b1 = creator1.createProductB();
        //产生B2对象
        AbstractProductB b2 = creator2.createProductB();
        
        /*
         * 业务逻辑
         */
        a1.doSomething();
        a2.doSomething();
        b1.doSomething();
        b2.doSomething();
    }
}
