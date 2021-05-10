package com.example.designmode.strategy;

/**
 * @author wangxg
 * @date 2021-03-24 3:20 下午
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
