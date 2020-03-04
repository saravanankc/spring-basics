package com.kc.mylearnings.springbasics.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope -> proxyMode = ScopedProxyMode.TARGET_CLASS - If this class is one of the dependency class and every time a new object to be created for Bean class (PersonDAO).
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {
    public ComponentJdbcConnection(){
        System.out.println("Creating COMPONENT JDBC Connection");
    }
}
