package aarif.com;
public class Reverse_Array {
    public int array( int arr[])
    {
        int len= arr.length;
        int var=0;

        for(int i=0;i<=len;i++)
        {
             var=var+i;
        }
        return var;
    }
    public static void main(String[] args) {
        Reverse_Array obj=new Reverse_Array();
        int arr[]={1,2,3,4,5,6,7};
        int var2=obj.array(arr);
        System.out.println(var2);
    }
}
/*
char[]={'a','a','r','i,'f'};
String str="aarif";
*/

