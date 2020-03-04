package com.kc.mylearnings.springbasics.basics.mvcannotation;

import org.springframework.stereotype.Service;

@Service
//Annotation used to define a business service class
public class MvcQuickMvcSortAlgorithm implements MvcSortAlgorithm {
    public int[] sort(int[] inputArray) {
        //Logic for quick sort
        return inputArray;
    }
}
