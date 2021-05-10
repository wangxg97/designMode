package com.example.designmode.observer.get;

import com.example.designmode.observer.pull.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wangxg
 * @date 2021-04-13 11:52 上午
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and" + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
