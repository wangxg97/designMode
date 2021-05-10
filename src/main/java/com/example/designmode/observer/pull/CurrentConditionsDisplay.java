package com.example.designmode.observer.pull;

/**
 * @author wangxg
 * @date 2021-04-13 11:03 上午
 * 观察者实现类
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        //注册观察者
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and" + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
