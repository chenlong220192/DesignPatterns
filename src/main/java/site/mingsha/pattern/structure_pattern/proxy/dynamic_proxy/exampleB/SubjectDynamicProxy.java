package site.mingsha.pattern.structure_pattern.proxy.dynamic_proxy.exampleB;

import java.lang.reflect.InvocationHandler;

/**
 *
 * @author hjp21925
 * @version $Id: SubjectDynamicProxy.java, v 0.1 2016年8月25日 下午7:49:00 hjp21925 Exp $
 */
@SuppressWarnings("rawtypes")
public class SubjectDynamicProxy extends DynamicProxy {
    
    public static <T> T newProxyInstance(Subject subject) {
        //获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        //获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        //获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
