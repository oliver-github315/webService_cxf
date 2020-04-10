package com.cx.test;

import com.cx.client.client01.WeatherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        WeatherService weatherService = (WeatherService)applicationContext.getBean("weatherService");
        String result = weatherService.queryWeather("北京");
        System.out.println(result);
    }
}
