/*
  * File: StringLogger.java
  * Author: Hunter Holmes hholmes1@uab.edu
  * Assignment:  P2
  * Vers: 1.0.0 09/17/2018 hah - initial coding
  * Vers: 2.0.0 09/26/2018 hah - modifications and additions for P2, added loggers and clock
 */

import java.util.ArrayList;

/**
 * Model a room with temperature being controlled with the use of a heater
 * @author Hunter Holmes hholmes1@uab.edu
 */
public class StringLogger extends Logger {

    int stringThreshold;
    ArrayList stringLog;
    int logCount;

    /**
     *
     */
    public StringLogger() {
        stringThreshold = 0;
        logCount = 0;
    }

    /**
     * Create a StringLogger with specific threshold
     * @param threshold level that has to be met or exceeded for logging to
     * occur
     */
    public StringLogger(int threshold) {
        stringThreshold = threshold;
    }

    /**
     * Retrieve the logged strings
     * @return an ArrayList of strings is returned
     */
    public ArrayList<String> getLog() {

        return stringLog;
    }

    /**
     * Collect a string if level is >= threshold. The logger class defines
     * common values for level.
     * @param level value noting the type of the information
     * @param logEntry text to be part of the accumulated string log
     */
    @Override
    public void log(int level, String logEntry) {
        if (level <= this.stringThreshold) {
            stringLog.add(logCount, logEntry);
        } else {
            //nothing yet
        }
    }

    /**
     * Clear the accumulated log strings
     */
    public void clear() {
        stringLog.clear();
    }

}
