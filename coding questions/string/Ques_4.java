/** Check anagrams */
//Two strings,  and , are called anagrams if they contain all the same characters in the
//same frequencies. For this challenge, the test is not case-sensitive. For example, the
//anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

package com.basic.string;

import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Strings :");
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();

        if(a.length() != b.length())
        {
            System.out.println("Not Anagrams");
            return;
        }


        int[] arrA = new int[26];
        int[] arrB = new int[26];

        int n = a.length();

        for(int i=0;i<n;i++){
            arrA[a.charAt(i)-97]++;
            arrB[b.charAt(i)-97]++;
        }

        for(int i=0; i<26; i++){
            if(arrA[i]!=arrB[i]){
                System.out.println("Not Anagrams");
                return;
            }
        }

        System.out.println("Anagrams");
    }
}

