package com.kc.mylearnings.springbasics.basics.externalprops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalService {

    @Value("app.service.url")
    private String url;

    @Value("app.env")
    private String env;

    public String getUrl() {
        return url;
    }
    public String getEnv() {
        return env;
    }

}
