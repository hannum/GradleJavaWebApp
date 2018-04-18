/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gradle.demo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hannutam
 */
public class AnotherJunitTest {
  @Test
    public void dummyUnitTest() {
        assertEquals(0, 1);
    }
    
    @Test
    public void dummyUnitTest2() {
        assertEquals(0, 0);
    }
}
