package com.kc.mylearnings.springbasics.componentscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {

    private Logger LOGGER = LoggerFactory.getLogger(ComponentDAO.class);

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return componentJdbcConnection;
    }

    public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;
    }

    @Autowired
    ComponentJdbcConnection componentJdbcConnection;

    @PostConstruct
    public void PostConstruct(){
        LOGGER.info("post construct");
    }

    @PreDestroy
    public void PreDestroy(){
        LOGGER.info("pre destroy");
    }
}
