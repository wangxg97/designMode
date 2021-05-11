package com.example.designmode.adapter;

/**
 * @author wangxg
 * @date 2021-05-11 3:00 下午
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
