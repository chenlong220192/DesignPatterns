package site.mingsha.pattern.structure_pattern.adapter;

/**
 * 适配器
 * @author Administrator
 *
 */
public class Adapter extends Adaptee implements Target {
	
	public void request() {
		super.doSomething();
	}
	
}
