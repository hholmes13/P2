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
public class RoomTest {
    
    public RoomTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getTemp method, of class Room.
     */
    @Test
    public void testGetTemp() {
        System.out.println("getTemp");
        Room instance = null;
        double expResult = 0.0;
        double result = instance.getTemp();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Room.
     */
    @Test
    public void testAdd_TempSensor() {
        System.out.println("add");
        TempSensor ts = null;
        Room instance = null;
        instance.add(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Room.
     */
    @Test
    public void testAdd_Heater() {
        System.out.println("add");
        Heater htr = null;
        Room instance = null;
        instance.add(htr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preClock method, of class Room.
     */
    @Test
    public void testPreClock() {
        System.out.println("preClock");
        Room instance = null;
        instance.preClock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clock method, of class Room.
     */
    @Test
    public void testClock() {
        System.out.println("clock");
        Room instance = null;
        instance.clock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
