package com.cx.service;

import com.cx.entity.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * restful不用打webService注解,也没有WSDL文档
 * 客户端一般使用httpClient调用
 * 访问地址：http://localhost:8990/cxf_webservice/ws/getPerson/111
 */
@Path("/ws")
public interface WeatherService {

    @Path("/getPerson/{id}")
    @GET
    @Produces({MediaType.APPLICATION_XML})
    Person queryWeather(@PathParam("id") Integer id);
}
