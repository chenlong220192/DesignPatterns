/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.behaviour_pattern.state;

/**
 * 状态1
 * @author hjp21925
 * @version $Id: ConcreteState1.java, v 0.1 2016年8月26日 下午1:26:51 hjp21925 Exp $
 */
public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        //本状态下必须处理的逻辑
        System.out.println("state1 handle1...");
    }
    
    @Override
    public void handle2() {
        //设置当前状态为stat2
        super.context.setCurrentState(Context.STATE2);
        System.out.println("状态切换到state2...");
        //过渡到state2状态，由Context实现
        super.context.handle2();
    }
}
