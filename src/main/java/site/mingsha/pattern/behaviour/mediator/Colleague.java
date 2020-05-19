package site.mingsha.pattern.behaviour.mediator;

/**
 * @author chenlong
 * @version : Colleague.java, v0.1 2020/5/18 Exp $$
 */
public abstract class Colleague {
    protected Mediator mediator;
    
    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
