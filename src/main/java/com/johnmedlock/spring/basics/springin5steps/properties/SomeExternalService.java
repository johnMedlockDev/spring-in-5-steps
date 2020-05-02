package com.johnmedlock.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
    // from props
    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL(){
        return url;
    }
}
