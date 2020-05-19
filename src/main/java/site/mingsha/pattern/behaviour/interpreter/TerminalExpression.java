package site.mingsha.pattern.behaviour.interpreter;

/**
 * 终结符表达式
 *
 * @author chenlong
 * @version : TerminalExpression.java, v0.1 2020/5/18 Exp $$
 */
public class TerminalExpression extends Expression {
    
    /**
     * 通常终结符表达式只有一个，但是有多个对象
     * @param ctx
     * @return
     */
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
    
}
