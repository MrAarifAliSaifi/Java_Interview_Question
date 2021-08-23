package practice.com;
public class Duplicate_Elements_In_Array {
    public static void Duplicate(int arr[])
    {
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
              if(arr[i]==arr[j])
              {
                  System.out.println(arr[i]);
              }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,4,5,6,7,2,2};
        Duplicate(arr);
    }
}
