package aarif.com;
class Array{
    public int missing(int arr[])
    {
        int sum=0;
        int len= arr.length;
        for(int i=0;i<len;i++)
            sum=sum+arr[i];
        return sum;
    }
    public int calculate(int n)
    {
        int calculation=n*(n+1)/2;
        return  calculation;
    }

}
public class Missing_Number_In_Java {
    public static void main(String[] args) {
     Array obj=new Array();
     int arr[]={1,2,3,4,5,7,8,9,10};
     int result=obj.missing(arr);
     int sum=obj.calculate(10);
        int finalresult=sum-result;
        System.out.println("the missing number in the array is:"+finalresult);


    }
}
