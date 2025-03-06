package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class maintest1 {

    private main1 main;

    @Before
    public void setUp() {
        main = new main1();    
    }

    @Test
    public void testGreet() {
        assertEquals("Hello ,Jenkins !", main.greet());
    }
}
