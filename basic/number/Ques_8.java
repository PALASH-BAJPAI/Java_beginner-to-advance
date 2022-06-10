/** Check prime number */

package com.basic.number;

public class Ques_8 {
    public static void main(String[] args) {

        int n= 37;

        for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.println(n+ " is not a prime number");
                return ;
            }
        }

        System.out.println(n+ " is prime");
    }
}