/** Factorial of a number */

package com.basic.number;

public class Ques_4 {
    public static void main(String[] args) {

        int num = 10;
        long fact = 1;

        for(int i =1 ;i <=num; i++){
            fact *=i;
        }

        System.out.format("Factorial of %d is %d",num,fact);
    }
}