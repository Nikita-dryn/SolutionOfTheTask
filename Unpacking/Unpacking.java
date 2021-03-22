package com.Unpacking;

import java.util.Scanner;
import java.util.logging.Logger;

public class Unpacking {

    static Logger logger = Logger.getLogger("Unpacking.class");

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        TestOnRegex test = new TestOnRegex();

        while (n != 1) {

            System.out.println("Please enter command for unpacking: ");
            String input = in.next(); // String input = "3[xyz]4[xy]z"

            if (test.testOnRegex(input)) {

                while (input.contains("[") && input.contains("]")) {
                    input = ReplaceString.replaceString(input);
                }
                logger.info("Unpacking string is: " + input); // xyzxyzxyzxyxyxyxyz

            } else {
                Logger logger = Logger.getLogger("Mistake in regex");
                logger.warning("Invalid input, please enter correct command." +
                        " For exist enter 1, for continue enter anything number.");
                n = in.nextInt();

            }
            System.out.print("For exist enter 1, for continue enter anything number: ");
            n = in.nextInt();
        }

    }
}
