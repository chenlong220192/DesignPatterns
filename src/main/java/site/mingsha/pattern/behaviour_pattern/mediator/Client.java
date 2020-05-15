package site.mingsha.pattern.behaviour_pattern.mediator;

/**
 * 场景类
 * @author Administrator
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		ConcreteColleague1 colleague1  = new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2  = new ConcreteColleague2(mediator);
		mediator.setC1(colleague1);
		mediator.setC2(colleague2);
		//通过中介者交互
//    	colleague1.interact();
		//通过中介者交互
		colleague2.interact();
	}
	
}
