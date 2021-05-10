package com.example.designmode.factory;

/**
 * @author wangxg
 * @date 2021-04-21 3:27 下午
 * 实际产品类
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if (item.equals("veggie")){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
