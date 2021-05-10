package com.example.designmode.decorator;

/**
 * @author wangxg
 * @date 2021-04-13 7:51 下午
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
