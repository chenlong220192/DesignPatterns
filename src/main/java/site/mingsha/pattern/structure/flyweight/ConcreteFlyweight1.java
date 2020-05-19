package site.mingsha.pattern.structure.flyweight;

/**
 * @author chenlong
 * @version : ConcreteFlyweight1.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteFlyweight1 extends Flyweight {
    
    /**
     * 接受外部状态
     *
     * @param _Extrinsic
     */
    public ConcreteFlyweight1(String _Extrinsic) {
        super(_Extrinsic);
    }
    
    /**
     * 根据外部状态进行逻辑处理
     */
    @Override
    public void operate() {
        // 业务逻辑
    }
    
}
