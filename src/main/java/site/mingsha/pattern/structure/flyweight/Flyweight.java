package site.mingsha.pattern.structure.flyweight;

/**
 * @author chenlong
 * @version : Flyweight.java, v0.1 2020/5/18 Exp $$
 */
public abstract class Flyweight {
    /**
     * 内部状态
     */
    private String intrinsic;
    /**
     * 外部状态
     */
    protected final String extrinsic;
    
    /**
     * 要求享元角色必须接受外部状态
     *
     * @param _Extrinsic
     */
    public Flyweight(String _Extrinsic) {
        this.extrinsic = _Extrinsic;
    }
    
    /**
     * 定义业务操作
     */
    public abstract void operate();
    
    /**
     * 内部状态的getter
     *
     * @return
     */
    public String getIntrinsic() {
        return intrinsic;
    }
    
    public String getExtrinsic() {
        return extrinsic;
    }
    
    /**
     * 内部状态的setter
     *
     * @param intrinsic
     */
    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
    
}
