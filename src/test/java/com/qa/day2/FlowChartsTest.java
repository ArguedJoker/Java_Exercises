package com.qa.day2;


import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlowChartsTest {

    static FlowCharts flowcharts;

    @BeforeClass

    public static void Test1() {
        flowcharts = new FlowCharts();
    }

    @Test
    public void method1test()
    {
        assertEquals(FlowCharts.method1(4, 3), 12);
        assertEquals(FlowCharts.method1(1, 2), 2);
    }

}