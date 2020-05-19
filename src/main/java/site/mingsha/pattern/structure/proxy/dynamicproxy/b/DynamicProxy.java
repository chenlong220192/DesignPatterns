package site.mingsha.pattern.structure.proxy.dynamicproxy.b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 * @author chenlong
 * @version : DynamicProxy.java, v0.1 2020/5/18 Exp $$
 */
public class DynamicProxy<T> {
    /**
     * @param loader
     * @param interfaces
     * @param h
     * @param <T>
     * @return
     */
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true) {
            // 执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        // 执行目标，并返回结果
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }
}
