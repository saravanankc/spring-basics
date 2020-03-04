package com.kc.mylearnings.springbasics.basics.cdiannotations;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {

    private Logger LOGGER = LoggerFactory.getLogger(CdiBusiness.class);

    public CdiDAO getCdiDAO() {
        return cdiDAO;
    }

    @Inject
    CdiDAO cdiDAO;

    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int[] data = cdiDAO.getData();
        for (int i : data) {
            if(i > greatest)
                greatest = i;
        }
        return greatest;
    }
}
