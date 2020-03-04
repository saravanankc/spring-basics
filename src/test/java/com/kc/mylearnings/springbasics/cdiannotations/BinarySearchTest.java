package com.kc.mylearnings.springbasics.cdiannotations;


import com.kc.mylearnings.springbasics.basics.cdiannotations.CdiBusiness;
import com.kc.mylearnings.springbasics.basics.cdiannotations.CdiDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BinarySearchTest {

    @InjectMocks
    CdiBusiness cdiBusiness;

    @Mock
    CdiDAO cdiDAOMock;

    @Test
    public void testFindGreatest() {
        //When cdiDAOMock.getData() is called return int[] {4,5}. Now for this test actual database data is mocked with custom values.
        when(cdiDAOMock.getData()).thenReturn(new int[]{4,5});

        int actualResult = cdiBusiness.findGreatest();
        assertEquals(5, actualResult);
    }

    @Test
    public void testFindGreatest_noinputs() {
        when(cdiDAOMock.getData()).thenReturn(new int[]{});
        int actualResult = cdiBusiness.findGreatest();
        assertEquals(Integer.MIN_VALUE, actualResult);
    }

    @Test
    public void testFindGreatest_equalinputs() {
        when(cdiDAOMock.getData()).thenReturn(new int[]{6,6,6});
        int actualResult = cdiBusiness.findGreatest();
        assertEquals(6, actualResult);
    }
}
