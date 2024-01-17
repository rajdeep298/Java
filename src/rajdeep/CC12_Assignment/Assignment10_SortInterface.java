package rajdeep.CC12_Assignment;

interface Sort{
    void sort(int[] arr);
}
class Bubblesort implements Sort{
    public void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
class Selectionsort implements Sort{
    public void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
public class Assignment10_SortInterface {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        Bubblesort b = new Bubblesort();
        b.sort(arr);
        System.out.println("Sorted array using bubblesort is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr1={5,4,3,2,1};
        Selectionsort s = new Selectionsort();
        s.sort(arr1);
        System.out.println("Sorted array using selectionsort is:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
