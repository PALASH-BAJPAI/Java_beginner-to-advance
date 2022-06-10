/** Swap two numbers */

package com.basic.number;

public class Ques_3 {
    public static void main(String[] args) {

        // using temporary variable
        int a= 23 , b= 43;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.printf("Values if a and b after swapping is : %d %d",a,b );

        // without using temporary variable
        int x= 10 , y= 29;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.printf("\nValues if x and y after swapping is : %d %d",x,y );



    }
}