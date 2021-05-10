package com.example.designmode.decorator;

/**
 * @author wangxg
 * @date 2021-04-13 5:58 下午
 * 摩卡是一个装饰者，扩展自CondimentDecorator
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1;
    }
}
