/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.behaviour.state;

/**
 * @author chenlong
 * @version : ConcreteState1.java, v0.1 2020/5/18 Exp $$
 */
public class ConcreteState1 extends State {
    
    @Override
    public void handle1() {
        // 本状态下必须处理的逻辑
        System.out.println("state1 handle1...");
    }
    
    @Override
    public void handle2() {
        // 设置当前状态为stat2
        super.context.setCurrentState(Context.STATE2);
        System.out.println("状态切换到state2...");
        // 过渡到state2状态，由Context实现
        super.context.handle2();
    }
}
