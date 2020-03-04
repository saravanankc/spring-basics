package com.kc.mylearnings.springbasics.basics;

import com.kc.mylearnings.springbasics.basics.externalprops.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//@ComponentScan("com.saravanan.spring.basics.Spring.in.few.steps.basic") //TODO: THIS DID NOT WORK
@PropertySource("classpath:app.properties")
public class SpringInFewStepReadExternalPropsApplication {

    public static void main(String[] args) {

        Logger LOGGER = LoggerFactory.getLogger(SpringInFewStepReadExternalPropsApplication.class);

        try(AnnotationConfigApplicationContext  applicationContext = new AnnotationConfigApplicationContext(SpringInFewStepReadExternalPropsApplication.class)){

            SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);

            LOGGER.info("Env:{} - Url: {}", someExternalService.getEnv(), someExternalService.getUrl());
        }
    }
}
