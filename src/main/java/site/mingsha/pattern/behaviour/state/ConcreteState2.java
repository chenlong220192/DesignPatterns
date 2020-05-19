/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.behaviour.state;

/**
 * @author chenlong
 * @version : ConcreteState2.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        // 设置当前状态为state1
        super.context.setCurrentState(Context.STATE1);
        // 过渡到state1状态，由Context实现
        super.context.handle1();
    }
    
    @Override
    public void handle2() {
        // 本状态下必须处理的逻辑
        System.out.println("state2 handle2...");
    }
}
