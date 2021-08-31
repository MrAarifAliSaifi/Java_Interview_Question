package data_structure;
class Reverse{
    public  int sortkthlargest(int arr[] ,int position){
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
     return arr[(arr.length-1)-position];
    }
}
public class Sorting_the_array{
    public static void main(String[] args) {
        int arr[]={1,5,2,7,8,9,2,3,6,5};
        Reverse re=new Reverse();
        int pos=re.sortkthlargest(arr,3);
        System.out.println(pos);
    }
}
