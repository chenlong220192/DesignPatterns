package site.mingsha.pattern.behaviour_pattern.memento;

/**
 *
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016年8月25日 下午4:42:17 hjp21925 Exp $
 */
public class Client {
    
    public static void main(String[] args) {
        //定义出发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        //恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
    }
}
