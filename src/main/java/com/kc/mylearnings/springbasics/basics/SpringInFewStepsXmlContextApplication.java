package com.kc.mylearnings.springbasics.basics;

import com.kc.mylearnings.springbasics.basics.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInFewStepsXmlContextApplication {

    public static void main(String[] args) {

        Logger LOGGER = LoggerFactory.getLogger(SpringInFewStepsXmlContextApplication.class);

        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
            XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);

            LOGGER.info("Count: {} - Beans: {}", applicationContext.getBeanDefinitionCount(), applicationContext.getBeanDefinitionNames());

            LOGGER.info("\n***BEAN SCOPE****");
            LOGGER.info("{} - connection {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
        }
    }

}
