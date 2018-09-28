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

    private Clockable[] clockables;
    private int clockableCount;
    private Logger logger;

    /**
     * Create a clock with no logging
     */
    public Clock() {
        this.clockables = new Clockable[100];
        this.clockableCount = 0;
    }

    /**
     * Create a clock with logging
     * @param logger the object to use for logging, if null then no logging
     */
    public Clock(Logger logger) {
        this.logger = logger;
        this.clockables = new Clockable[100];
        this.clockableCount = 0;
    }

    /**
     * Add clockable object to the ordered collection of objects that will be
     * when run is called
     * @param object
     */
    public void add(Clockable object) {
        clockableCount++;
        this.clockables[clockableCount - 1] = object;
    }

    /**
     * Issue clock signals (a preClock followed by a clock) to each registered
     * clockable object signifying 1 second has passed. First, signal preClock
     * to all registered objects in the order registered and then signal Clock
     * to all registered objects in the same order
     */
    public void run() {
        for (int i = 0; i < clockableCount; i++) {
            clockables[i].preClock();
        }

        for (int i = 0; i < clockableCount; i++) {
            clockables[i].clock();
        }
    }

    /**
     * Issue n seconds worth of signals based on run()
     * @param n number of seconds to signal
     */
    public void run(int n) {
        for (int i1 = 0; i1 < n; i1++) {

            for (int i2 = 0; i2 < clockableCount; i2++) {
                this.clockables[i2].preClock();
            }

            for (int i2 = 0; i2 < clockableCount; i2++) {
                this.clockables[i2].clock();
            }
        }

    }

}
