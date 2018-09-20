/*
 * File: Room.java
 * Author: Hunter Holmes hholmes1@uab.edu
 * Assignment:  P1
 * Vers: 1.0.0 09/17/2018 hah - initial coding
 */

/**
 * Model a room with temperature being controlled with the use of a heater
 *
 * @author Hunter Holmes hholmes1@uab.edu
 */
public class Room {

    //Variables used in this class
    protected int temp;
    public Heater heater;
    public TempSensor ts;
    protected double tNew;
    protected double tOld;
    protected static int loopCount = 0;
    double[] tempDisturbance;

    /**
     * Room constructor
     *
     * @param tempDisturbance
     * @param intialTemp
     */
    public Room(double[] tempDisturbance, double intialTemp) {
        this.tOld = intialTemp;
        this.tempDisturbance = tempDisturbance;
    }

    /**
     *
     * @return
     */
    public double getTemp() {

        return this.temp;
    }

    /**
     * add a temperature sensor to a room
     *
     * @param ts
     */
    public void add(TempSensor ts) {
        this.ts = ts;
    }

    /**
     * add a heater to a room
     *
     * @param htr
     */
    public void add(Heater htr) {
        this.heater = htr;
    }

    /**
     * Calculates new temp based on a given disturbance and based on whether or
     * not the heater is running
     */
    public void preClock() {
        if (this.heater.getState() == true) {
            tNew = (0.33333) * (tOld + this.tempDisturbance[loopCount] + 95);
        } else {
            tNew = (0.5) * (tOld + this.tempDisturbance[loopCount]);
        }
    }

    /**
     * Sets the temperature of the room's sensor to the new temp so that it may
     * be responded to Increases loopCount so that array within this class
     * follows along with disturbance array in main method Sets tOld equal to
     * tNew so that tOld will be ready for the next increment through the
     * disturbance array
     *
     */
    public void clock() {
        this.ts.setTemp(tNew);
        loopCount++;
        tOld = tNew;
    }

}
