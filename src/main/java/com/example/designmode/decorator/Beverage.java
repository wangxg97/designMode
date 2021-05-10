package com.example.designmode.decorator;

/**
 * @author wangxg
 * @date 2021-04-13 5:44 下午
 * 被装饰者
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
