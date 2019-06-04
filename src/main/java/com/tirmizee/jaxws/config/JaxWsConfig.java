package com.tirmizee.jaxws.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.sun.xml.ws.transport.http.servlet.WSSpringServlet;

@Configuration
@ImportResource(locations = "jaxwsconfig.xml")
public class JaxWsConfig {

	@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new WSSpringServlet(), "/ws");
    }
	
}
