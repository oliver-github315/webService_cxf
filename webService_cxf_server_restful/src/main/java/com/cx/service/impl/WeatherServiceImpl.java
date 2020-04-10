package com.cx.service.impl;

import com.cx.entity.Person;
import com.cx.service.WeatherService;
import org.springframework.stereotype.Component;

@Component//restful注入bean用
public class WeatherServiceImpl implements WeatherService {

    @Override
    public Person queryWeather(Integer id) {
        Person person = new Person("王五","男",id);
        return person;
    }
}
