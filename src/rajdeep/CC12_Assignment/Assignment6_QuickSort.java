package rajdeep.CC12_Assignment;

import java.util.Scanner;

class QuickSort{
    public void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    public int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int l=low,r=high;
        while(l<r){
            while(pivot>=arr[l] && l<high){
                l++;
            }
            while(pivot<arr[r]){
                r--;
            }
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[r];
        arr[r]=temp;
        return r;
    }
}

public class Assignment6_QuickSort {
    public static void main(String[] args) {
        int[] arr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        QuickSort q=new QuickSort();
        q.quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
