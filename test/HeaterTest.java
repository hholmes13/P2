/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hholmes
 */
public class HeaterTest {
    
    public HeaterTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getUID method, of class Heater.
     */
    @Test
    public void testGetUID() {
        System.out.println("getUID");
        Heater instance = null;
        long expResult = 0L;
        long result = instance.getUID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class Heater.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        boolean state = false;
        Heater instance = null;
        instance.setState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class Heater.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Heater instance = null;
        boolean expResult = false;
        boolean result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Heater.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Heater instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
