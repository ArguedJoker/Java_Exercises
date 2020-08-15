package com.qa.day4;
import com.qa.day4.cipher;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class cipherTest {

    @BeforeClass
    public static void Initialise(){
        cipher.main(null);
    }
    @Test
    public void methodTest(){
        cipherTest cipher = new cipherTest();
        //assertEquals("draziw",cipher.method1("wizard"));
    }
}