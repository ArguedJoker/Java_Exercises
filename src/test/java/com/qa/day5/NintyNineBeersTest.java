package com.qa.day5;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NintyNineBeersTest {

    @Test
    public void methodTest1(){
        NintyNineBeersTest Beers = new NintyNineBeersTest();
        assertEquals(0, NintyNineBeers.method1());
    }

}

