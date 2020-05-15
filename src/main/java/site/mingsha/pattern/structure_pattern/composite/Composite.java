package site.mingsha.pattern.structure_pattern.composite;

import java.util.ArrayList;

/**
 * 非叶子节点
 * @author hjp21925
 * @version $Id: Composite.java, v 0.1 2016年8月25日 下午4:55:05 hjp21925 Exp $
 */
public class Composite extends Component {
    //构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();
    
    //增加一个叶子构件或树枝构件
    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }
    
    //删除一个叶子构件或树枝构件
    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }
    
    //获得分支下的所有叶子构件和树枝构件
    @Override
    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
