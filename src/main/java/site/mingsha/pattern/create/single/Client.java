package site.mingsha.pattern.create.single;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
	
	public static void main(String[] args) {
		// 懒汉模式
		LazySingleton lazySingleton = LazySingleton.getSingleton();
		lazySingleton.doSomething();
		
		LazySingleton lazySingletonA = LazySingleton.getSingleton();
		LazySingleton lazySingletonB = LazySingleton.getSingleton();
		System.out.println(lazySingletonA==lazySingletonB);
		
		// 饿汉模式
		HungrySingleton hungrySingleton = HungrySingleton.getSingleton();
		hungrySingleton.doSomething();
		
		HungrySingleton hungrySingletonA = HungrySingleton.getSingleton();
		HungrySingleton hungrySingletonB = HungrySingleton.getSingleton();
		System.out.println(hungrySingletonA==hungrySingletonB);
	}
	
}
