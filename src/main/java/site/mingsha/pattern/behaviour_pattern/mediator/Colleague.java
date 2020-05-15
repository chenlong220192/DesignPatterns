package site.mingsha.pattern.behaviour_pattern.mediator;

/**
 * 同事类
 * @author hjp21925
 * @version $Id: Colleague.java, v 0.1 2016年8月25日 下午4:44:49 hjp21925 Exp $
 */
public abstract class Colleague {
    protected Mediator mediator;
    
    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
