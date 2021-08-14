package aarif.com;
class largest{
    public void lar(int arr[])
    {
        int len=arr.length;
        int largest=arr[0];
        for(int i=0;i<len;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];

            }

        }
        System.out.println("The largest elemnets in the array is:"+largest);
    }
    public void small(int arr[])
    {
        int len=arr.length;
        int smallest=arr[0];
        for(int i=0;i<len;i++)
        {
            if(smallest>arr[i])
            {
                smallest=arr[i];

            }

        }
        System.out.println("The smallest number in the array is:"+smallest);
    }
}
public class LaregstandSmallestinarray {
    public static void main(String[] args) {
        largest l=new largest();
        int arr[]={1,2,3,4,5,6,7,8};
        l.lar(arr);
        l.small(arr);

    }
}
