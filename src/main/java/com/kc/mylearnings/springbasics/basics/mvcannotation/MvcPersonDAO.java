package com.kc.mylearnings.springbasics.basics.mvcannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MvcPersonDAO {

    public MvcJdbcConnection getMvcJdbcConnection() {
        return mvcJdbcConnection;
    }

    public void setMvcJdbcConnection(MvcJdbcConnection mvcJdbcConnection) {
        this.mvcJdbcConnection = mvcJdbcConnection;
    }

    @Autowired
    MvcJdbcConnection mvcJdbcConnection;

}
