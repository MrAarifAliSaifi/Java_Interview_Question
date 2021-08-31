public class Reverse_Array{
    public int[] reverse(int arr1[])
    {
        int len=arr1.length;
        int i=0,j=len-1;
        for(;i<len;i++)
        {
            int temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
            i++;
            j--;
        }
        return arr1;
    }
    public static void main(String[] args) {
        Reverse_Array obj=new Reverse_Array();
        int arr[]={1,2,3,4,5,6,7};
        obj.reverse(arr);
        for(int ele:arr)
        {
            System.out.print(ele+"\t");
        }
    }
}
