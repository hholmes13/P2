/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author hholmes
 */
public class StringLogger extends Logger {

    /**
     * Create a StringLogger with specific threshold
     * @param threshold level that has to be met or exceeded for logging to
     * occur
     */
    public StringLogger(int threshold) {

    }

    /**
     * Retrieve the logged strings
     * @return an ArrayList of strings is returned
     */
    public ArrayList<String> getLog() {
        ArrayList<String> list = new ArrayList<String>() {
            {
                add("A");
                add("B");
                add("C");
            }
        };

        return list;
    }

    /**
     * Collect a string if level is >= threshold. The logger class defines
     * common values for level.
     * @param level value noting the type of the information
     * @param logEntry text to be part of the accumulated string log
     */
    @Override
    public void log(int level, String logEntry) {

    }

    /**
     * Clear the accumulated log strings
     */
    public void clear() {

    }

}
