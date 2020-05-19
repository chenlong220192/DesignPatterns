package site.mingsha.pattern.behaviour.iterator;

import java.util.Vector;

/**
 * @author chenlong
 * @version : ConcreteIterator.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteIterator implements Iterator {
    
    /**
     *
     */
    private Vector vector = new Vector();
    /**
     * 定义当前游标
     */
    public int cursor = 0;
    
    /**
     * @param _vector
     */
    public ConcreteIterator(Vector _vector) {
        this.vector = _vector;
    }
    
    /**
     * 判断是否到达尾部
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * 返回下一个元素
     *
     * @return
     */
    @Override
    public Object next() {
        Object result = null;
        
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;
    }
    
    /**
     * 删除当前元素
     *
     * @return
     */
    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
    
}
