/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package site.mingsha.pattern.behaviour_pattern.state;

/**
 * 状态2
 * @author hjp21925
 * @version $Id: ConcreteState1.java, v 0.1 2016年8月26日 下午1:26:51 hjp21925 Exp $
 */
public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        //设置当前状态为state1
        super.context.setCurrentState(Context.STATE1);
        //过渡到state1状态，由Context实现
        super.context.handle1();
    }
    
    @Override
    public void handle2() {
        //本状态下必须处理的逻辑
        System.out.println("state2 handle2...");
    }
}
