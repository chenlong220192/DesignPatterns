package site.mingsha.pattern.structure.composite;

import java.util.ArrayList;

/**
 * 叶子节点
 *
 * @author chenlong
 * @version : Leaf.java, v0.1 2020/5/18 Exp $$
 */
public class Leaf extends Component {
    
    @Override
    @Deprecated
    public void add(Component component) throws UnsupportedOperationException {
        // 空实现,直接抛弃一个“不支持请求”异常
        throw new UnsupportedOperationException();
    }
    
    @Override
    @Deprecated
    public void remove(Component component) throws UnsupportedOperationException {
        // 空实现
        throw new UnsupportedOperationException();
    }
    
    @Override
    @Deprecated
    public ArrayList<Component> getChildren() throws UnsupportedOperationException {
        // 空实现
        throw new UnsupportedOperationException();
    }
}
