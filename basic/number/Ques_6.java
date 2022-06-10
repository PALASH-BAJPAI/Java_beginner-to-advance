/** GCD of 2 numbers  */

package com.basic.number;

public class Ques_6 {
    public static void main(String[] args) {

        int a= 32, b= 28;
        int gcd = 1;

        for(int i=1;i<=a && i<=b; i++){
            if(a%i==0 && b%i==0)
                gcd=i;
        }

        System.out.printf("Gcd of %d and %d is %d",a,b,gcd);

    }
}