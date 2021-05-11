package com.example.designmode.adapter;

/**
 * @author wangxg
 * @date 2021-05-11 2:58 下午
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
