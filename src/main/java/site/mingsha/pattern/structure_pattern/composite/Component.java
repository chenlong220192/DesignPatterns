package site.mingsha.pattern.structure_pattern.composite;

import java.util.ArrayList;

/**
 * 节点
 * @author hjp21925
 * @version $Id: Component.java, v 0.1 2016年8月25日 下午4:55:26 hjp21925 Exp $
 */
public abstract class Component {
    
    //个体和整体都具有的共享
    public void doSomething() {
        //编写业务逻辑
    }
    
    //增加一个叶子构件或树枝构件
    public abstract void add(Component component);
    
    //删除一个叶子构件或树枝构件
    public abstract void remove(Component component);
    
    //获得分支下的所有叶子构件和树枝构件
    public abstract ArrayList<Component> getChildren();
}
