package site.mingsha.pattern.create_pattern.prototype;

/**
 *
 * @author hjp21925
 * @version $Id: PrototypeClass.java, v 0.1 2016年8月25日 下午8:24:06 hjp21925 Exp $
 */
public class PrototypeClass implements Cloneable {
    //覆写父类Object方法
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            //异常处理
        }
        return prototypeClass;
    }
}
