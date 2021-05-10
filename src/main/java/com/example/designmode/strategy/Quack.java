package com.example.designmode.strategy;

/**
 * @author wangxg
 * @date 2021-03-24 3:28 下午
 */
public class Quack implements  QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
