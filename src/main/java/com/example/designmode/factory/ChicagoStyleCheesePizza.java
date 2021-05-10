package com.example.designmode.factory;

/**
 * @author wangxg
 * @date 2021-04-21 3:09 下午
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
