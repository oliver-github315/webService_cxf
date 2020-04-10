package com.cx.service;


import javax.jws.WebService;

@WebService
public interface WeatherService {
    String queryWeather( String cityName);
}
