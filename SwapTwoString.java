package aarif.com;
class swap{
    public void  swaping( String str1,String str2)
    {
        String temp;
        temp=str1;
        str1=str2;
        str2=temp;
        System.out.println(str1+" "+str2);
    }
}
public class SwapTwoString {
    public static void main(String[] args) {
        swap sw=new swap();
        sw.swaping("aarif","billa");
    }
}
