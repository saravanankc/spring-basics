package com.kc.mylearnings.springbasics.basics;

import com.kc.mylearnings.springbasics.basics.externalprops.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInFewStepsCdiAnnotationsApplication {

    //slf4j logger
    private static Logger LOGGER = LoggerFactory.getLogger(SpringInFewStepsCdiAnnotationsApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringInFewStepsCdiAnnotationsApplication.class, args);

        SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);

        LOGGER.info("Env: {} - Url: {}", someExternalService.getEnv(), someExternalService.getUrl());
    }

}
