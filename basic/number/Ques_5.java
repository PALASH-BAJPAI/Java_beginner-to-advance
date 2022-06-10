/** Fibonacci Value */
/* Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
each value is sum of previous 2 values ,find nth value*/

package com.basic.number;

public class Ques_5 {
    public static void main(String[] args) {

        int n= 10;
        int a=0, b=1;
        int ans = 0;

        n-=2;   //since a and b are 1st and second values
        while(n!=0){
            ans = a+b;
            a = b;
            b = ans;
            n--;
        }
        System.out.printf("%d th value of fibonacci series is %d", n,ans);
    }
}