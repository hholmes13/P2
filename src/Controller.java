/*
 * File: Controller.java
 * Author: Hunter Holmes hholmes1@uab.edu
 * Assignment:  P1
 * Vers: 1.0.0 09/17/2018 hah - initial coding
 */

/**
 * Model a room with temperature being controlled with the use of a heater
 *
 * @author Hunter Holmes hholmes1@uab.edu
 */
public class Controller {

    //Variables used in this class
    private Heater heater;
    private TempSensor ts;

    /**
     * Controller constructor
     */
    public Controller(Logger logger) {
    }

    /**
     * Provide the string “Controller with TS:{UID} = {temperature} and
     * Heater:{UID} = {state}”
     * @return formatted string
     */
    @Override
    public String toString() {
        return ("Controller with TS:" + ts.getUID() + " = " + this.ts.tsTemp + " and Heater:" + heater.getUID() + " = " + this.heater.status);
    }

    /**
     * connects a temp sensor only one temp sensor at a time overrides with
     * newest sensor
     * @param ts
     */
    public void connect(TempSensor ts) {
        this.ts = ts;
    }

    /**
     * connects a heater only one heater at a time overrides with most most
     * recent connect request
     * @param heater
     */
    public void connect(Heater heater) {
        this.heater = heater;
        this.heater.setState(false);
    }

    /**
     * Actions before the clock None in first version (P1)
     */
    public void preClock() {

    }

    /**
     * Check current sensor temp and decide to turn on, turn off, or do nothing
     * turn on when below 68.0 turn off when above 71.0 maintain state otherwise
     */
    public void clock() {
        if (this.ts.getTemp() < 68.0) {
            this.heater.setState(true);
        } else if (this.ts.getTemp() > 71.0) {
            this.heater.setState(false);
        } else {
            //do nothing
        }
    }

}
