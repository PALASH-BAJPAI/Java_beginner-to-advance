/** Maximum and minimum occurring character */
// to traverse java string use str.toCharArray()

package com.basic.string;

public class Ques_6 {
    public static void main(String[] args) {
        String s= "Apple is good for health";
        s = s.replaceAll("\\s+","");  //remove whitespaces using regex

        s = s.toLowerCase();
        int[] arr = new int[26]; //initial value is 0

        for(char c : s.toCharArray())
            arr[c-97]++;

        int min = 10000;
        int max = 0;
        char minV = 'a', maxV = 'a';

        for(int i=0; i<26 ;i++) {
            if (arr[i] !=0 && arr[i] < min) {
                min = arr[i];
                minV = (char) (i + 97);
            }
            if (arr[i] > max) {
                max = arr[i];
                maxV = (char) (i + 97);
            }
        }

            System.out.println("Most occurring character is : " + maxV );
            System.out.println("Least occurring character is : " + minV );

    }
}
