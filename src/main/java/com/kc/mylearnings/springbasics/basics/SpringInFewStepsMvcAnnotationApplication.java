package com.kc.mylearnings.springbasics.basics;

import com.kc.mylearnings.springbasics.basics.mvcannotation.MvcPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInFewStepsMvcAnnotationApplication {

    //slf4j logger
    private static Logger LOGGER = LoggerFactory.getLogger(SpringInFewStepsMvcAnnotationApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringInFewStepsMvcAnnotationApplication.class, args);

        MvcPersonDAO personDAO = applicationContext.getBean(MvcPersonDAO.class);

        MvcPersonDAO personDAO2 = applicationContext.getBean(MvcPersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getMvcJdbcConnection());
        LOGGER.info("{}", personDAO.getMvcJdbcConnection());
        LOGGER.info("{}", personDAO.getMvcJdbcConnection());

        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getMvcJdbcConnection());
    }

}
