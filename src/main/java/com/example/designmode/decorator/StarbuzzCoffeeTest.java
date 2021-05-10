package com.example.designmode.decorator;

/**
 * @author wangxg
 * @date 2021-04-13 7:53 下午
 */
public class StarbuzzCoffeeTest {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription()+"$"+beverage.cost());
    }
}
