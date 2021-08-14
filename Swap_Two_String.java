package aarif.com;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class swap1{
    public void swaping(String str1,String str2)
    {
      str1=str1+str2;
      str2=str1.substring(0,str1.length()-str2.length());
      str1=str1.substring(str1.length()-str2.length());
        System.out.println("the string str1 is:"+str1+"the str2 is"+str2);
    }
}
public class Swap_Two_String {
    public static void main(String[] args) {
        swap1 obj=new swap1();
        obj.swaping("AARIF","SAIFI");


    }
}
