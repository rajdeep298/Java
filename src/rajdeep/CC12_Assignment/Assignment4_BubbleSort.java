//write a java program to sort an array of integers using bubble sort.Take Input of array elements under a constructor .
package rajdeep.CC12_Assignment;

import java.util.Scanner;

class BubbleSort{
    int[] arr=new int[100];
    int n;
    Scanner input=new Scanner(System.in);
    BubbleSort(int n){
        this.n=n;
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+"th element:");
            arr[i]=input.nextInt();
        }
    }
    void sort(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    void print(){
        System.out.println("Sorted array is=>");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class Assignment4_BubbleSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=input.nextInt();
        BubbleSort bubbleSort=new BubbleSort(n);
        bubbleSort.sort();
        bubbleSort.print();
    }
}
