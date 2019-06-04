package com.tirmizee.jaxws.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

@Component(value = "greetingService")
@WebService
public class GreetingService {

	@WebMethod
    public String greeting() {
        return "Hello World!";
    }
	
}
