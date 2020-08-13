package com.qa.day2;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BlackJackTest {

    static BlackJack blackjack;

    @BeforeClass

    public static void test1() {blackjack = new BlackJack();}

    @Test
    public void method1test()
    {
        assertEquals(BlackJack.method1(19), 19);
    }
    @Test
    public void method2test()
    {
        assertEquals(BlackJack.method2(18), 18);
    }

    @Test
    public void method3test()
    {
        assertEquals(BlackJack.method3(19,18), 19);
    }

    @Test
    public void method4test()
    {
        assertEquals(BlackJack.method4(29), 0);
    }

    @Test
    public void method5test()
    {
        assertEquals(BlackJack.method5(31), 0);
    }

}