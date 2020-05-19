package site.mingsha.pattern.structure.adapter;

/**
 * 适配器
 * @author chenlong
 * @version : Adapter.java, v0.1 2020/5/18 Exp $$
 */
public class Adapter extends Adaptee implements Target {
	
	/**
	 *
	 */
	@Override
	public void request() {
		super.doSomething();
	}
	
}
