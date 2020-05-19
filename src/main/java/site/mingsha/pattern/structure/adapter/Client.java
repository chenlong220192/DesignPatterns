package site.mingsha.pattern.structure.adapter;

/**
 * @author chenlong
 * @version : Client.java, v0.1 2020/5/18 Exp $$
 */
public class Client {
	
	public static void main(String[] args) {
		Target target2 = new Adapter();
		target2.request();
	}
}
