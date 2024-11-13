/** Find all substrings of string */

//subarray - A subarray is a slice from a contiguous array (i.e., occupy consecutive positions) and inherently
//           maintains the order of elements. For example, the subarrays of array {1, 2, 3} are {1}, {1, 2}, {1, 2, 3},
//           {2}, {2, 3}, and {3}

//substring - A substring of a string s is a string s' that occurs in s. A substring is almost similar to a subarray,
//            but it is in the context of strings.

//subsequence - A subsequence is a sequence that can be derived from another sequence by deleting some elements without
//              changing the order of the remaining elements. For example, {nums, B, D} is a subsequence of sequence
//              {nums, B, C, D, E} obtained after removing {C} and {E}.

// subset - A subset is any possible combination of the original set. The term subset is often used for subsequence,
//          but that’s not right. A subsequence always maintains the relative order of the array elements
//          (i.e., increasing index), but there is no such restriction on a subset. For example, {3, 1} is a valid
//          subset of {1, 2, 3, 4, 5}, but it is neither a subsequence nor a subarray.

package com.basic.string;

import java.util.Arrays;
import java.util.Scanner;

public class Ques_5 {
    public static void main(String[] args) {

        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //Total possible substrings for string of size n is n*(n+1)/2
        int n = s.length();
        String[] arr = new String[n*(n+1)/2] ;
        int temp = 0;
        for(int i=0; i<n; i++)
            for(int j=i; j<n; j++){
                arr[temp] = s.substring(i,j+1);
                temp++;
            }

        System.out.println("Substrings are: " + Arrays.toString(arr));
    }
}
