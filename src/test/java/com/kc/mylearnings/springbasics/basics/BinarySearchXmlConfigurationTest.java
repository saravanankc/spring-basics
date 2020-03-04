package com.kc.mylearnings.springbasics.basics;

import com.kc.mylearnings.springbasics.basics.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
//Either directly use the application context defined in main application package (OR)
//@ContextConfiguration(locations = "/applicationContext.xml")
// (OR) use a local TestContext.xml that can import applicationContext.xml and override beans as necessary
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXmlConfigurationTest {

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
