
/**
 * Subject: Implementation of data structures and algorithms
 * Long Project LP2: Skip lists
 *
 */
package sxm180018;

/**
 *
 * @author Shivani Mankotia: sxm180018
 * @author Maitreyee Abhijit Mhasakar: mam171630
 * @author Bhavish Khanna Narayanan: bxn170002
 *
 */

public class Timer {
    long startTime, endTime, elapsedTime, memAvailable, memUsed;

    public Timer() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public Timer end() {
        endTime = System.currentTimeMillis();
        elapsedTime = endTime-startTime;
        memAvailable = Runtime.getRuntime().totalMemory();
        memUsed = memAvailable - Runtime.getRuntime().freeMemory();
        return this;
    }

    public String toString() {
        return "Time: " + elapsedTime + " msec.\n" + "Memory: " + (memUsed/1048576) + " MB / " + (memAvailable/1048576) + " MB.";
    }

}
