package com.cx.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface WeatherService {
    /**
     * @ WebMethod ：默认为false，表示此方法对外发布
     * @ WebResult(name = "resultWeather")  ： 返回值别名
     * @ WebParam(name = "cityName")：参数别名
     */
    @WebMethod
    @WebResult(name = "resultWeather")
    String queryWeather(@WebParam(name = "cityName") String cityName);
}
