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
public class ControllerTest {
    
    public ControllerTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of toString method, of class Controller.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Controller instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connect method, of class Controller.
     */
    @Test
    public void testConnect_TempSensor() {
        System.out.println("connect");
        TempSensor ts = null;
        Controller instance = null;
        instance.connect(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connect method, of class Controller.
     */
    @Test
    public void testConnect_Heater() {
        System.out.println("connect");
        Heater heater = null;
        Controller instance = null;
        instance.connect(heater);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preClock method, of class Controller.
     */
    @Test
    public void testPreClock() {
        System.out.println("preClock");
        Controller instance = null;
        instance.preClock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clock method, of class Controller.
     */
    @Test
    public void testClock() {
        System.out.println("clock");
        Controller instance = null;
        instance.clock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
