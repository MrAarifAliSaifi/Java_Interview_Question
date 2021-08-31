package data_structure;
public class Occurence_Of_An_Integer {
    public static int occurence(int arr[],int key)
    {
        int count=0;
       int len=arr.length;
       for(int ele:arr)
       {
           if(ele==key)
               count++;
       }
       return count;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,3,4,4,5,5,6,7};
        System.out.println(occurence(arr,3));
    }
}
