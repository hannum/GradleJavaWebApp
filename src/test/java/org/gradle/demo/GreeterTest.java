/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gradle.demo;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author hannutam
 */
public class GreeterTest {
    @Test
    public void testGreet() {
		//System.out.println("testGreet");
        Greeter greeter = new Greeter();
        assertEquals("Hello, Tester", greeter.greet("Tester"));
        assertEquals("Hello, World", greeter.greet(null));
    }
     @Test
    public void dummyUnitTest() {
        assertEquals(0, 1);
    }
}
