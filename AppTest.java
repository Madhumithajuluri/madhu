package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGetGreeting() {
        assertEquals("Hello World!", App.getGreeting());
    }
}
