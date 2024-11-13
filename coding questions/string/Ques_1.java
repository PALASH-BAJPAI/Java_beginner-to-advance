/** Input String by cleaning buffer */
//Read an int, a double and a string

/* Solution
 If you use the nextLine() method immediately following the nextInt() method, recall that nextInt()
 reads integer tokens; because of this, the last newline character for that line of integer input is
 still queued in the input buffer and the next nextLine() will be reading the remainder of the integer
 line (which is empty).
*/
package com.basic.string;
import java.util.Scanner;

public class Ques_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        scan.nextLine();             //to read enter of buffer
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);



    }
}

/* After supplying data for int, we would hit the enter key. What nextInt() and nextDouble() does is it assigns
   integer to appropriate variable and keeps the enter key unread in thekeyboard buffer. so when its time
   to supply String the nextLine() will read the enter key from the user thinking that the user has entered
   the enter key.(that's we get empty output) . Unlike C, there is no fflush() to clean buffer, so we have
   to flush by not taking it in variable.
*/