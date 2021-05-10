package com.example.designmode.factory;

/**
 * @author wangxg
 * @date 2021-04-21 3:13 下午
 */
public abstract class PizzaStore {
    public Pizza orderPrize(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
