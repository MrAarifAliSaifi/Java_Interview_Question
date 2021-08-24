package practice.com;
public class Count012{
    public static void sort012(int a[], int n)
    {
        int count0=0,count1=0,count2=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)count0++;
            else if(a[i]==1)count1++;
            else if(a[i]==2)count2++;
        }
        for(int i=0;i<count0;i++)
        {
            a[i]=0;
        }
        for(int i=count0;i<count0+count1;i++)
        {
            a[i]=1;
        }
        for(int i=count1+count0;i<n;i++)
        {
            a[i]=2;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,0,0,0,1,1,1,1,1,1,2};
        int len=arr.length;
        sort012(arr,len);
    }
}
