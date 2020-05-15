package site.mingsha.pattern.behaviour_pattern.chain_of_responsiblity;

/**
 * @author mingsha
 * @version : Demo.java, v0.1 2020/5/16 00:19 Exp $$
 */
public class Client {
    
    public static void main(String[] args) {
        //声明出所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        //设置链中的阶段顺序,1-->2-->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        //提交请求，返回结果
        @SuppressWarnings("unused")
        Response response = handler1.handlerMessage(new Request());
    }
    
}
