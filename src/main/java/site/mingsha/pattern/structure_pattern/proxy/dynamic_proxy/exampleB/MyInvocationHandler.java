package site.mingsha.pattern.structure_pattern.proxy.dynamic_proxy.exampleB;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * MyInvocationHandler
 * @author hjp21925
 * @version $Id: MyInvocationHandler.java, v 0.1 2016年8月25日 下午7:47:29 hjp21925 Exp $
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target = null;
    
    //通过构造函数传递一个对象
    public MyInvocationHandler(Object _obj) {
        this.target = _obj;
    }
    
    //代理方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法
        return method.invoke(this.target, args);
    }
}
