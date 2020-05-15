package site.mingsha.pattern.behaviour_pattern.interpreter;

/**
 * 表达式
 * @author hjp21925
 * @version $Id: Expression.java, v 0.1 2016年8月25日 下午4:46:02 hjp21925 Exp $
 */
public abstract class Expression {
    //每个表达式必须有一个解析任务
    public abstract Object interpreter(Context ctx);
}
