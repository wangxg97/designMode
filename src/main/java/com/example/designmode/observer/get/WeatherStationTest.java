package com.example.designmode.observer.get;


/**
 * @author wangxg
 * @date 2021-04-13 11:26 上午
 * 测试类
 */
public class WeatherStationTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);

    }
}
