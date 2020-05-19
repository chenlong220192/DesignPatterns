package site.mingsha.pattern.structure.proxy.dynamicproxy.b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * @author chenlong
 * @version : MyInvocationHandler.java, v0.1 2020/5/18 Exp $$
 */
public class MyInvocationHandler implements InvocationHandler {
    
    /**
     * 被代理的对象
     */
    private Object target = null;
    
    /**
     * 通过构造函数传递一个对象
     *
     * @param _obj
     */
    public MyInvocationHandler(Object _obj) {
        this.target = _obj;
    }
    
    /**
     * 代理方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 执行被代理的方法
        return method.invoke(this.target, args);
    }
}
