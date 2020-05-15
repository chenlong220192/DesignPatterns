package site.mingsha.pattern.create_pattern.single;

/**
 * 客户端
 * @author Administrator
 *
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
