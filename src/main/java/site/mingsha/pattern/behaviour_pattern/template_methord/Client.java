package site.mingsha.pattern.behaviour_pattern.template_methord;

/**
 * 场景类
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月25日 下午5:02:29 hjp21925 Exp $
 */
public class Client {
    
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        
        //调用模版方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
