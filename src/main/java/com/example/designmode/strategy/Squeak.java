package com.example.designmode.strategy;

/**
 * @author wangxg
 * @date 2021-03-24 3:31 下午
 */
public class Squeak implements  QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
