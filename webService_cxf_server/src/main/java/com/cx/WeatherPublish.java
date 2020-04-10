package com.cx;

import com.cx.service.impl.WeatherServiceImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class WeatherPublish {
    public static void main(String[] args) {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();

        jaxWsServerFactoryBean.setAddress("http://localhost:8989/cxf_webservice");
        jaxWsServerFactoryBean.setServiceClass(WeatherServiceImpl.class);

        Server server = jaxWsServerFactoryBean.create();
        server.start();
    }
}
