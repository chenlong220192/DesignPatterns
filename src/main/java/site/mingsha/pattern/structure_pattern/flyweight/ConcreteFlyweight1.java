package site.mingsha.pattern.structure_pattern.flyweight;

/**
 *
 * @author hjp21925
 * @version $Id: ConcreteFlyweight1.java, v 0.1 2016年8月26日 上午9:48:16 hjp21925 Exp $
 */
public class ConcreteFlyweight1 extends Flyweight {
    
    //接受外部状态
    public ConcreteFlyweight1(String _Extrinsic) {
        super(_Extrinsic);
    }
    
    //根据外部状态进行逻辑处理
    @Override
    public void operate() {
        //业务逻辑
    }
    
}
