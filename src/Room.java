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
public class Room implements Clockable {

    //Variables used in this class
    public Heater heater;
    public TempSensor tempSensor;
    
    private double[]           disturbance;
    private double             roomTemp;
    private int                dIndex;
    private final static int   HOT_AIR  =  95;

    /**
     * Room constructor
     *
     * @param tempDisturbance
     * @param intialTemp
     */
    public Room(double[] tempDisturbance, double initialTemp) {
        disturbance = tempDisturbance;
        dIndex      = 0;
        roomTemp    = initialTemp;
    }

    /**
     *
     * @return
     */
    public double getTemp() {
        return roomTemp;
    }

    /**
     * add a temperature sensor to a room
     *
     * @param ts
     */
    public void add(TempSensor ts) {
        tempSensor = ts;
    }

    /**
     * add a heater to a room
     *
     * @param htr
     */
    public void add(Heater htr) {
        heater = htr;
    }

    /**
     * Calculates new temp based on a given disturbance and based on whether or
     * not the heater is running
     */
    public void preClock() {
        if (this.heater.getState() == true) {
            roomTemp = (1.0/3) * (roomTemp + this.disturbance[dIndex] + 95.0);
        } else {
            roomTemp = (1./2) * (roomTemp + this.disturbance[dIndex]);
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
        dIndex++;
        if (dIndex >= disturbance.length) {
            dIndex = 0;
        }
    
  }

}
