package site.mingsha.pattern.behaviour_pattern.iterator;

/**
 *
 * @author hjp21925
 * @version $Id: Iterator.java, v 0.1 2016年8月25日 下午4:43:13 hjp21925 Exp $
 */
public interface Iterator {
    
    //遍历到下一个元素
    public Object next();
    
    //是否已经遍历到尾部
    public boolean hasNext();
    
    //删除当前指向的元素
    public boolean remove();
}
