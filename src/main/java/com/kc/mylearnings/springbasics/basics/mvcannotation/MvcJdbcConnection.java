package com.kc.mylearnings.springbasics.basics.mvcannotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MvcJdbcConnection {
    public MvcJdbcConnection() {
        System.out.println("Creating JDBC Connection");
    }
}
