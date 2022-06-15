/** Smallest and largest substring */
//Find lexicographically smallest and largest substring of length k
package com.basic.string;
import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println("Enter length");
        int k = sc.nextInt();

        Ques_3 sub = new Ques_3();
        String a,b ;
        a= sub.stringCompare(s,k)[0];
        b= sub.stringCompare(s,k)[1];

        System.out.println("Smallest substring is : " + a);
        System.out.println("Largest substring is : " + b);
    }

    public String[] stringCompare(String s, int k)
    {
        String[] ans = new String[2];
        ans[0] = s.substring(0,k);
        ans[1] = s.substring(0,k);

        String temp;
        int n = s.length();
        for(int i=0 ; i<=n-k;i++){
            temp = s.substring(i,i+k);
            if(ans[0].compareTo(temp)>0)
                ans[0]=temp;
            if(ans[1].compareTo(temp)<0)
                ans[1]=temp;

        }
        return ans;
    }

}
