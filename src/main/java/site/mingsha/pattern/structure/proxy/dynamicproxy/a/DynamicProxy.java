package site.mingsha.pattern.structure.proxy.dynamicproxy.a;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理对象
 *
 * @author chenlong
 * @version : DynamicProxy.java, v0.1 2020/5/18 Exp $$
 */
public class DynamicProxy {
    /**
     * 定义要代理哪个类
     */
    private Object obj = null;
    
    /**
     * 通过构造函数传递被代理对象
     *
     * @param _obj
     */
    public DynamicProxy(Object _obj) {
        Class c = _obj.getClass();
        // 生成被代理类的代理类
        this.obj = Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), new MyInvocationHandler(_obj));
    }
    
    /**
     * 执行代理类的方法
     *
     * @param methodName
     * @param args
     * @return
     */
    public Object exec(String methodName, Object... args) {
        // 返回值
        Object result = null;
        // 方法中的参数类型
        Class[] c = new Class[args.length];
        int i = 0;
        // 获得参数的类型
        for (Object o : args) {
            c[i] = o.getClass();
            i++;
        }
        try {
            // 根据方法名称和参数类型查找到唯一一个方法
            Method method = this.obj.getClass().getMethod(methodName, c);
            // 执行该方法
            result = method.invoke(this.obj, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
}
