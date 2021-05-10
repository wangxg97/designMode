package com.example.designmode.observer.pull;

/**
 * @author wangxg
 * @date 2021-04-12 6:01 下午
 * 观察者
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
