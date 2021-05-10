package com.example.designmode.strategy;

/**
 * @author wangxg
 * @date 2021-03-24 3:16 下午
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
