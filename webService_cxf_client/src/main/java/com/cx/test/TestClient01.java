package com.cx.test;

import com.cx.client.client01.WeatherService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * wsdl2java -d . -p com.cx.client.client01 http://localhost:8989/cxf_webservice?wsdl
 * wsdl2java -d . -p com.cx.client.client01 -client http://localhost:8989/cxf_webservice?wsdl
 */
public class TestClient01 {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:8989/cxf_webservice");
        jaxWsProxyFactoryBean.setServiceClass(WeatherService.class);//portType

        WeatherService weatherService = (WeatherService) jaxWsProxyFactoryBean.create();
        String result = weatherService.queryWeather("北京");
        System.out.println(result);
    }
}
