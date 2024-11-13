/** Reverse a number */

package com.basic.number;

public class Ques_1 {
    public static void main(String[] args) {

        int num = 21413;
        int rev =0, temp = 0;

        while(num != 0){
            temp = num%10;
            rev = rev*10 + temp;
            num /=10;
        }

        System.out.println("Reversed number is : " + rev);

    }
}