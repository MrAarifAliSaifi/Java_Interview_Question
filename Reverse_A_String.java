package aarif.com;//package

import java.sql.SQLOutput;

public class Reverse_A_String {//creating the main class
    public  String reverse(String str)
    {
       String  str1="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);

        }
        System.out.println("The actual string before reverse is:"+str);
        return str1;
    }
    public static void main(String[] args){
        Reverse_A_String obj=new Reverse_A_String();

        System.out.println(obj.reverse("aarif"));


    }
}
