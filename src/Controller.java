/*
 * File: Controller.java
 * Author: Hunter Holmes hholmes1@uab.edu
 * Assignment:  P2
 * Vers: 1.0.0 09/17/2018 hah - initial coding
 * Vers: 2.0.0 09/26/2018 hah - modifications and additions for P2, added loggers and clock
 */

/**
 * Model a room with temperature being controlled with the use of a heater
 *
 * @author Hunter Holmes hholmes1@uab.edu
 */
public class Controller implements Clockable {

    //Variables used in this class
    private Heater heater;
    private TempSensor ts;
    private Logger logger;

    private int secondCount;

    /**
     * Controller constructor
     * @param logger
     */
    public Controller(Logger logger) {
        this.logger = logger;
        secondCount = 0;
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
        this.logger.log(10, "\nController Connected to " + ts.toString());
    }

    /**
     * connects a heater only one heater at a time overrides with most most
     * recent connect request
     * @param heater
     */
    public void connect(Heater heater) {
        this.heater = heater;
        this.heater.setState(false);
        this.logger.log(10, "Controller Connected to " + heater.toString());
    }

    /**
     * Actions before the clock None in first version (P1)
     */
    @Override
    public void preClock() {
        this.secondCount++;
        this.logger.log(20, "\n" + secondCount + " Sec.");
    }

    /**
     * Check current sensor temp and decide to turn on, turn off, or do nothing
     * turn on when below 68.0 turn off when above 71.0 maintain state otherwise
     */
    @Override
    public void clock() {
        if ((this.ts.getTemp() < 68.0) && (this.heater.getState() == false)) {
            this.heater.setState(true);
        } else if ((this.ts.getTemp() > 71.0) && (this.heater.getState() == true)) {
            this.heater.setState(false);
        } else {
            //do nothing
        }
    }

}
