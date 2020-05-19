package site.mingsha.pattern.behaviour.iterator;

import java.util.Vector;

/**
 * @author chenlong
 * @version : ConcreteAggregate.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteAggregate implements Aggregate {
    /**
     * 容纳对象的容器
     */
    private Vector vector = new Vector();
    
    /**
     * 增加一个元素
     *
     * @param object
     */
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }
    
    /**
     * 返回迭代器对象
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
    
    /**
     * 删除一个元素
     *
     * @param object
     */
    @Override
    public void remove(Object object) {
        this.remove(object);
    }
    
}
