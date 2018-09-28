/*
  * File: PrintLogger.java
  * Author: Hunter Holmes hholmes1@uab.edu
  * Assignment:  P1
  * Vers: 1.0.0 09/17/2018 hah - initial coding
 */

/**
 * Model a room with temperature being controlled with the use of a heater
 * @author Hunter Holmes hholmes1@uab.edu
 */
public class PrintLogger extends Logger{
    
    /**
     * 
     */
    public PrintLogger(){
        
    }
    
    
    /**
     * Create a PrintLogger with specified threshold
     * @param threshold level that has to be met or exceeded for logging to occur
     */
    public PrintLogger(int threshold){
        
    }
    
    /**
     * Prints a string to stdout if level is >= threshold
     * The printing routine will add a newline to the logEntry
     * The logger class defines common values for level
     * @param level value noting the type of the information
     * @param logEntry text to be part of the printed log
     */
    @Override
    public void log(int level, String logEntry){
        System.out.append("");
    }
}
