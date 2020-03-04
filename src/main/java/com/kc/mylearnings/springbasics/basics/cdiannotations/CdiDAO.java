package com.kc.mylearnings.springbasics.basics.cdiannotations;

import javax.inject.Named;

@Named
public class CdiDAO {

    public int[] getData(){
        return new int[]{12,234,345,456,3452,23,456};

    }

}
