package site.mingsha.pattern.behaviour.interpreter;

/**
 * 表达式
 *
 * @author chenlong
 * @version : Expression.java, v0.1 2020/5/18 Exp $$
 */
public abstract class Expression {
    /**
     * 每个表达式必须有一个解析任务
     * @param ctx
     * @return
     */
    public abstract Object interpreter(Context ctx);
}
