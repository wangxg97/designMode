package com.example.designmode.strategy;

/**
 * @author wangxg
 * @date 2021-03-24 3:30 下午
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
