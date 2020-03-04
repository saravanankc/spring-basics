package com.kc.mylearnings.springbasics.basics.mvcannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//Annotation used to define a business service class
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MvcBinarySearchImpl {

    @Autowired
    @Qualifier("mvcBubbleSortAlgorithm")
    private MvcSortAlgorithm mvcSortAlgorithm;

    public int BinarySearch(int[] numArray, int intToFind) {
        int[] sortedNumbers = mvcSortAlgorithm.sort(numArray);
        System.out.println(mvcSortAlgorithm);
        return 5;
    }
}
