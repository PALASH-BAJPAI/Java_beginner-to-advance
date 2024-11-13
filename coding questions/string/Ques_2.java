/**  Reverse the string */

package com.basic.string;
import java.util.*;

public class Ques_2
{
    public static void main(String[] arg)
    {
        Ques_2 rs=new Ques_2();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String  str=sc.nextLine();
        System.out.println("Reverse of a String  is : "+rs.reversestr(str));          //called method
    }
    //reverse string method
    static String reversestr(String s)
    {
        String r="";
        for(int i=s.length()-1;i>=0;i--)        //execute until condition i>0 becomes false
        {
            r=r+(s.charAt(i));
        }
        return r;
    }
}