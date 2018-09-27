/*
  * File: Clock.java
  * Author: Hunter Holmes hholmes1@uab.edu
  * Assignment:  P1
  * Vers: 1.0.0 09/17/2018 hah - initial coding
 */

/**
 * Model a room with temperature being controlled with the use of a heater
 * @author Hunter Holmes hholmes1@uab.edu
 */
public class Clock {

    /**
     * Create a clock with no logging
     */
    public void Clock() {

    }

    /**
     * Create a clock with logging
     * @param logger the object to use for logging, if null then no logging
     */
    public void Clock(Logger logger) {

    }

    /**
     * Add clockable object to the ordered collection of objects that will be
     * when run is called
     * @param object
     */
    public void add(Clockable object) {

    }
    
    /**
     * Issue clock signals (a preClock followed by a clock) to each registered
     * clockable object signifying 1 second has passed.
     * First, signal preClock to all registered objects in the order registered
     * and then signal Clock to all registered objects in the same order
     */
    public void run(){
        
    }
    
    /**
     * Issue n seconds worth of signals based on run()
     * @param n number of seconds to signal
     */
    public void run(int n){
        
    }

}
