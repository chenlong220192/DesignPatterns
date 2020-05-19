package site.mingsha.pattern.behaviour.iterator;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    
    public static void main(String[] args) {
        // 声明出容器
        Aggregate agg = new ConcreteAggregate();
        
        // 产生对象数据放进去
        agg.add("abc");
        agg.add("aaa");
        agg.add("1234");
        
        // 遍历一下
        Iterator iterator = agg.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
