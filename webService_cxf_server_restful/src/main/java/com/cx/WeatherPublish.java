package com.cx;

import com.cx.service.impl.WeatherServiceImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * 单纯restful
 */
public class WeatherPublish {
    public static void main(String[] args) {
        JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
        jaxrsServerFactoryBean.setAddress("http://localhost:8990/cxf_webservice");
        jaxrsServerFactoryBean.setResourceClasses(WeatherServiceImpl.class);
        Server server = jaxrsServerFactoryBean.create();
        server.start();
    }
}
