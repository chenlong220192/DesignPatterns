package site.mingsha.pattern.behaviour_pattern.interpreter;

/**
 * 非终结符表达式
 * @author hjp21925
 * @version $Id: NonterminalExpression.java, v 0.1 2016年8月25日 下午4:45:45 hjp21925 Exp $
 */
public class NonterminalExpression extends Expression {
    
    //每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(Expression... expression) {
    
    }
    
    @Override
    public Object interpreter(Context ctx) {
        //进行文法处理
        return null;
    }
    
}
