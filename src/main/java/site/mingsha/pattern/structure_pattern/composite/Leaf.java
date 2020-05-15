package site.mingsha.pattern.structure_pattern.composite;

import java.util.ArrayList;

/**
 * 叶子节点
 * @author hjp21925
 * @version $Id: Leaf.java, v 0.1 2016年8月25日 下午4:54:55 hjp21925 Exp $
 */
public class Leaf extends Component {
    @Override
    @Deprecated
    public void add(Component component) throws UnsupportedOperationException {
        //空实现,直接抛弃一个“不支持请求”异常
        throw new UnsupportedOperationException();
    }
    
    @Override
    @Deprecated
    public void remove(Component component) throws UnsupportedOperationException {
        //空实现
        throw new UnsupportedOperationException();
    }
    
    @Override
    @Deprecated
    public ArrayList<Component> getChildren() throws UnsupportedOperationException {
        //空实现
        throw new UnsupportedOperationException();
    }
}
