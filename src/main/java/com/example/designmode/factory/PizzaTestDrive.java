package com.example.designmode.factory;

/**
 * @author wangxg
 * @date 2021-04-21 3:31 下午
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza cheese = nyPizzaStore.orderPrize("cheese");
        System.out.println(cheese.getName());
    }
}
