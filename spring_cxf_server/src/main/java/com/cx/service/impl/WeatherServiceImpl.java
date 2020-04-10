package com.cx.service.impl;

import com.cx.service.WeatherService;
import org.springframework.stereotype.Component;


@Component
public class WeatherServiceImpl implements WeatherService {
    @Override
    public String queryWeather(String cityName) {
        if ("北京".equals(cityName)){
            return "这是首都，天气很棒!";
        }
        return "下雨啦！";
    }
}
