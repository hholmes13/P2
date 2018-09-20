/*
 * File: Heater.java
 * Author: Hunter Holmes hholmes1@uab.edu
 * Assignment:  P1
 * Vers: 1.0.0 09/17/2018 hah - initial coding
 */

/**
 * Model a room with temperature being controlled with the use of a heater
 *
 * @author Hunter Holmes hholmes1@uab.edu
 */
public class Heater {

    // Variables used in this class
    protected long hUID;
    protected static int hCount = 0;
    protected boolean state = false;
    String status;

    /**
     * Constructor for a heater Increases count of heaters and creates a unique
     * ID for a new heater
     */
    public Heater() {
        this.hUID = 20000 + hCount;
        hCount++;
    }

    /**
     * passes up the unique ID for a particular heater object
     *
     * @return UID
     */
    public long getUID() {
        return hUID;
    }

    /**
     * sets state for the heater when prompted to change converts true/false to
     * ON/OFF for ease of displaying status
     *
     * @param state
     */
    public void setState(boolean state) {
        if (state == true) {
            this.status = "ON";
            this.state = true;
        } else {
            this.status = "OFF";
            this.state = false;
        }
    }

    /**
     * returns the heater state as a boolean true or false true = ON, false =
     * OFF
     *
     * @return state
     */
    public boolean getState() {
        return state;
    }

    /**
     * converts true/false to ON/OFF for ease of displaying status returns the
     * string “Heater:{UID} = {status}”
     *
     * @return formatted string
     */
    @Override
    public String toString() {
        if (state == true) {
            this.status = "ON";
            this.state = true;
        } else {
            this.status = "OFF";
            this.state = false;
        }
        return ("Heater:" + this.hUID + " = " + this.status);
    }

}
