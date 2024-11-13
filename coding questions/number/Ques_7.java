/** Check armstrong number */
// The sum of cubes of each digit is equal to the number itself

package com.basic.number;

public class Ques_7 {
    public static void main(String[] args) {

        // 3*3*3 + 7*7*7 + 1*1*1 = 371
        int num = 371;
        int originalNum=num;
        int total = 0;
        int temp;

        while(num!=0){
            temp = num%10;
            total += temp*temp*temp;
            num /=10;
        }
        if(total == originalNum)
            System.out.println("It is an Armstrong number");
        else
            System.out.println("It is not an Armstrong number");
    }
}