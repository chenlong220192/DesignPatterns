package site.mingsha.pattern.structure.composite;

import java.util.ArrayList;

/**
 * 非叶子节点
 *
 * @author chenlong
 * @version : Composite.java, v0.1 2020/5/18 Exp $$
 */
public class Composite extends Component {
    /**
     * 构件容器
     */
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();
    
    /**
     * 增加一个叶子构件或树枝构件
     *
     * @param component
     */
    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }
    
    /**
     * 删除一个叶子构件或树枝构件
     *
     * @param component
     */
    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }
    
    /**
     * 获得分支下的所有叶子构件和树枝构件
     *
     * @return
     */
    @Override
    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
