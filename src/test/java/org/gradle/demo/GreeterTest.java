
package org.gradle.demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class GreeterTest {

    @Test
    public void dummyUnitTest1() {
        assertEquals(0, 0);
    }
    
    @Test
    public void dummyUnitTest2() {
        assertEquals(0, 0);
    }
    
    @Test
    public void testGreet() {
		//System.out.println("testGreet");
        Greeter greeter = new Greeter();
        assertEquals("Hello, Tester", greeter.greet("Tester"));
        assertEquals("Hello, World", greeter.greet(null));
    }
}