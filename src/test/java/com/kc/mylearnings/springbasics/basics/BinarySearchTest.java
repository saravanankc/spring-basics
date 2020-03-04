package com.kc.mylearnings.springbasics.basics;


import com.kc.mylearnings.springbasics.basics.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringInFewStepsBasicApplication.class)
public class BinarySearchTest {

    //Get the bean from context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBinarySearch() {
        // call actual binarySearch method
        int actualResult = binarySearch.BinarySearch(new int[]{2,4,5}, 5);
        // check if the value is correct
        assertEquals(5, actualResult);
    }
}
