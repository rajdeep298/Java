package rajdeep.CC12_Assignment;

interface Sortable {
    int[] sortArray(int[] arr);
}

class Bubblesort15 implements Sortable {
    public int[] sortArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}

class Selectionsort implements Sortable {
    public int[] sortArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        return arr;
    }
}

public class Assignment10_SortInterface {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,4};
        Bubblesort15 bubblesort=new Bubblesort15();
        Selectionsort selectionsort=new Selectionsort();
        arr=bubblesort.sortArray(arr);
        System.out.println("Sorted array using bubble sort is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr=selectionsort.sortArray(arr);
        System.out.println("Sorted array using selection sort is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}