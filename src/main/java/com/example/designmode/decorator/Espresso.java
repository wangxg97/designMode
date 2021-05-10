package com.example.designmode.decorator;

/**
 * @author wangxg
 * @date 2021-04-13 5:54 下午
 * 一种饮料
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
