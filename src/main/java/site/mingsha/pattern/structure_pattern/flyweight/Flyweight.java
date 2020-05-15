package site.mingsha.pattern.structure_pattern.flyweight;

public abstract class Flyweight {
    //内部状态
    private String         intrinsic;
    //外部状态
    protected final String extrinsic;
    
    //要求享元角色必须接受外部状态
    public Flyweight(String _Extrinsic) {
        this.extrinsic = _Extrinsic;
    }
    
    //定义业务操作
    public abstract void operate();
    
    //内部状态的getter
    public String getIntrinsic() {
        return intrinsic;
    }
    
    public String getExtrinsic() {
        return extrinsic;
    }
    
    //内部状态的setter
    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
    
}
