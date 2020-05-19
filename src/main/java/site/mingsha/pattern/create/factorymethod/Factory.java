/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.create.factorymethod;

/**
 * @author chenlong
 * @version : Factory.java, v0.1 2020/5/18 Exp $$
 */
public abstract class Factory {
    
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当然也可以为空
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
