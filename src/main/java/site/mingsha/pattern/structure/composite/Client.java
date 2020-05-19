package site.mingsha.pattern.structure.composite;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
    
    public static void main(String[] args) {
        // 创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        
        // 创建一个树枝构件
        Composite branch = new Composite();
        // 创建一个叶子节点
        Leaf leaf = new Leaf();
        
        // 建立整体
        root.add(branch);
        branch.add(leaf);
    }
    
    /**
     * 通过递归遍历树
     *
     * @param root
     */
    public static void display(Component root) {
        
        for (Component c : root.getChildren()) {
            // 叶子节点
            if (c instanceof Leaf) {
                c.doSomething();
            } else { //树枝节点
                display(c);
            }
        }
        
    }
}
