package com.example.designmode.decorator;

/**
 * @author wangxg
 * @date 2021-04-13 5:56 下午
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
