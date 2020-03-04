package com.kc.mylearnings.springbasics.basics;

import com.kc.mylearnings.springbasics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kc.mylearnings.springbasics.componentscan")
public class SpringInFewStepsComponentScanApplication {

    //slf4j logger
    private static Logger LOGGER = LoggerFactory.getLogger(SpringInFewStepsComponentScanApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringInFewStepsComponentScanApplication.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);
        LOGGER.info("{}", componentDAO.getComponentJdbcConnection());
    }

}
