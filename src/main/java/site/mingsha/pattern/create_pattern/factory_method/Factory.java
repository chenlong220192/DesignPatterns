/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.create_pattern.factory_method;

/**
 *
 * @author hjp21925
 * @version $Id: Creator.java, v 0.1 2016年8月25日 下午4:24:46 hjp21925 Exp $
 */
public abstract class Factory {
    /*
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当然也可以为空
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
