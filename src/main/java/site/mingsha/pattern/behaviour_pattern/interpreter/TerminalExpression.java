package site.mingsha.pattern.behaviour_pattern.interpreter;

/**
 * 终结符表达式
 * @author hjp21925
 * @version $Id: TerminalExpression.java, v 0.1 2016年8月25日 下午4:45:26 hjp21925 Exp $
 */
public class TerminalExpression extends Expression {
    
    //通常终结符表达式只有一个，但是有多个对象
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
    
}
