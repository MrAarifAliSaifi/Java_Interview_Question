package data_structure;
class Reverse{
    public  int[] sort(int arr[]){
     for(int i=0;i<arr.length;i++)
     {
         for(int j=i+1;j<arr.length;j++)
         {
             if(arr[i]>arr[j])
             {
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;

             }
         }
     }
     return arr;
    }
}
public class Sorting_the_array{

    public static void main(String[] args) {
        int arr[]={1,5,2,7,8,9,2,3,6,5};
        Reverse re=new Reverse();
        re.sort(arr);
        for(int ele:arr)
        {
            System.out.print(ele+" "+"\t");
        }
    }
}
