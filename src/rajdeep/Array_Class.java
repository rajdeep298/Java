package rajdeep;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Array_Class {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
}
