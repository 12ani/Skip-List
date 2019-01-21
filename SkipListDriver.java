
/**
 *
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


import sxm180018.Timer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

//Driver program for skip list implementation.
public class SkipListDriver {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc;
        if (args.length > 0) {
            File file = new File(args[0]);
            sc = new Scanner(file);
        } else {
            sc = new Scanner(System.in);
        }
        String operation = "";
        long operand = 0;
        int modValue = 999983;
        long result = 0;
        Long returnValue = null;
        SkipList<Long> skipList = new SkipList<>();
        // Initialize the timer
        Timer timer = new Timer();
        while (!((operation = sc.next()).equals("End"))) {
            switch (operation) {
                case "Add": {
                    operand = sc.nextLong();
                    if (skipList.add(operand)) {
                        result = (result + 1) % modValue;
                        System.out.println("Add: " + operand);
                    }
                    break;
                }
                case "Ceiling": {
                    operand = sc.nextLong();
                    returnValue = skipList.ceiling(operand);
                    if (returnValue != null) {
                        System.out.println("Ceiling: " + returnValue);
                        result = (result + returnValue) % modValue;
                    }
                    break;
                }
                case "First": {
                    returnValue = skipList.first();
                    if (returnValue != null) {
                        System.out.println("First: " + returnValue);
                        result = (result + returnValue) % modValue;
                    }
                    break;
                }
                case "Get": {
                    int intOperand = sc.nextInt();
                    returnValue = skipList.get(intOperand);
                    if (returnValue != null) {
                        System.out.println("Get: " + returnValue);
                        result = (result + returnValue) % modValue;
                    }
                    break;
                }
                case "Last": {
                    returnValue = skipList.last();
                    if (returnValue != null) {
                        System.out.println("Last: " + returnValue);
                        result = (result + returnValue) % modValue;
                    }
                    break;
                }
                case "Floor": {
                    operand = sc.nextLong();
                    returnValue = skipList.floor(operand);
                    if (returnValue != null) {
                        System.out.println("Floor: " + returnValue);
                        result = (result + returnValue) % modValue;
                    }
                    break;
                }
                case "Remove": {
                    operand = sc.nextLong();
                    if (skipList.remove(operand) != null) {
                        System.out.println("Remove: " + operand);
                        result = (result + 1) % modValue;
                    }

                    break;
                }
                case "Contains": {
                    operand = sc.nextLong();
                    if (skipList.contains(operand)) {
                        System.out.println("Contains: " + "Yes");
                        result = (result + 1) % modValue;
                    } else {
                        System.out.println("Contains: " + "NO");
                    }
                    break;
                }

            }
        }

        // End Time
        timer.end();

        System.out.println(result);
        skipList.printList();
        skipList.iterator().forEachRemaining(e -> System.out.print(e + "->"));
        System.out.println(result);
        System.out.println(timer);
    }
}
