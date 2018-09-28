/*
 * File: Logger.java
 * Author: Hunter Holmes hholmes1@uab.edu
 * Assignment:  P1
 * Vers: 1.0.0 09/17/2018 hah - initial coding
 */

/**
 * Model a room with temperature being controlled with the use of a heater
 * @author Hunter Holmes hholmes1@uab.edu
 */
public abstract class Logger {

    public int DEBUG = 0;
    public int INFO = 10;
    public int TIMESTAMP = 20;
    public int WARNING = 50;
    public int ERROR = 100;
    public int ALWAYS = 100000;
    
    /**
     * Set a new log threshold for actual logging
     * @param newThreshold level that must be met or exceeded for actual logging
     * when the logger is asked to do something
     */
    public void setLogThreshold(int newThreshold){
        
    }
    
    /**
     * Log a message if 'level' is greater than or equal to logger's threshold.
     * The actual logging routine will add a newline to the logEntry if appropriate.
     * @param level message's level
     * @param logEntry text to log (a newline will be added if appropriate)
     */
    public abstract void log(int level, String logEntry);
}
