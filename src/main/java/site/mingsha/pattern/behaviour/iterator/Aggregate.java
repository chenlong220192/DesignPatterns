package site.mingsha.pattern.behaviour.iterator;

/**
 * @author chenlong
 * @version : Aggregate.java, v0.1 2020/5/18 Exp $$
 */
public interface Aggregate {
    
    /**
     * 是容器必然有元素的增加
     *
     * @param object
     */
    void add(Object object);
    
    /**
     * 减少元素
     *
     * @param object
     */
    void remove(Object object);
    
    /**
     * 由迭代器来遍历所有的元素
     *
     * @return
     */
    Iterator iterator();
}
