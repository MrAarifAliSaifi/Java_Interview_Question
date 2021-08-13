package aarif.com;
class  Check{
    public void suplicate(String  str[])
    {
        int len= str.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(str[i].equals(str[j]))
                {
                    System.out.println("the duplicate elements is:"+str[j]);
                }
            }
        }
   }
}
public class Duplicate_in_String_Array{
    public static void main(String[] args){
    Check ch=new Check();
    String arr[]={"aarif","khalid","firoze","aarif"};
        ch.suplicate(arr);

    }
}
