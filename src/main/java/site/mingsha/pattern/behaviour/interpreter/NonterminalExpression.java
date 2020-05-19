package site.mingsha.pattern.behaviour.interpreter;

/**
 * 非终结符表达式
 *
 * @author chenlong
 * @version : NonterminalExpression.java, v0.1 2020/5/18 Exp $$
 */
public class NonterminalExpression extends Expression {
    
    /**
     * 每个非终结符表达式都会对其他表达式产生依赖
     * @param expression
     */
    public NonterminalExpression(Expression... expression) {
    
    }
    
    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public Object interpreter(Context ctx) {
        //进行文法处理
        return null;
    }
    
}
