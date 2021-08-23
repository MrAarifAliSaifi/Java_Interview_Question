package com.company;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Elements_In_Array_UsingHashSet{
    public static void Duplicate(int arr[])
    {
        int len=arr.length;
        Set<Integer> store= new HashSet<>();
        for(int elements:arr)
        {
            if(store.add(elements)==false)
            {
                System.out.println("This Duplicate elements found in array:"+elements);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6,6,7,8,9};
        Duplicate(arr);
    }
}
