package com.example.designmode.adapter;

/**
 * @author wangxg
 * @date 2021-05-11 3:13 下午
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
