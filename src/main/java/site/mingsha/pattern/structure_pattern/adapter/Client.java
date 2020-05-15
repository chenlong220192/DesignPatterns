package site.mingsha.pattern.structure_pattern.adapter;

/**
 * 场景类
 * @author Administrator
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Target target2 = new Adapter();
		target2.request();
	}
}
