package com.example.designmode.strategy;

/**
 * @author wangxg
 * @date 2021-03-24 4:05 下午
 */
public class MiniDuckSimulatorTest {
    public static void main(String[] args) {
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.setQuackBehavior(new MuteQuack());

        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
