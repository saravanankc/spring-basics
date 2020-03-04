package com.kc.mylearnings.springbasics.basics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope //Default returns singleton
//@Scope("singleton") //hardcoding is not a good practice instead use ConfigurableBeanFactory
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    @Autowired
    //@Qualifier helps to set custom dependencies based on need
    @Qualifier("bubbleSortAlgorithm")
    private SortAlgorithm sortAlgorithm;

    //This is setter injection
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    //This is constructor injection
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int BinarySearch(int[] numArray, int intToFind) {
        //Implement Sorting logic
//        BubbleSortAlgorithm algorithm = new BubbleSortAlgorithm();
//        int[] sortedNumbers = algorithm.sort(numArray);
        int[] sortedNumbers = sortAlgorithm.sort(numArray);
        System.out.println(sortAlgorithm);

        //Search Array
        //Return index

        return 5;
    }
}
