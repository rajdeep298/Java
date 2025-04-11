package rajdeep;

import java.util.*;

public class Array_Class {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]={6,7,8,9,10};

        int arr2[]={1,2,3,4,5};

        //to list
        System.out.println("Array to list"+Arrays.asList(arr));

        //binary search
        System.out.println("Binary search"+Arrays.binarySearch(arr, 3));

        // compare between two arrays
        System.out.println("Compare between two arrays"+Arrays.compare(arr,arr2));

        //to string
        System.out.println("To string:"+Arrays.toString(arr));

        //copy of
        System.out.println("Copy of:"+Arrays.toString(Arrays.copyOf(arr,10)));

        //copy of range
        System.out.println("Copy of range:"+Arrays.toString(Arrays.copyOfRange(arr,1,3)));

        //equals
        System.out.println("Equals:"+Arrays.equals(arr,arr2));
    }
}
