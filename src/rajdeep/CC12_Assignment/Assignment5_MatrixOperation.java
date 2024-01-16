package rajdeep.CC12_Assignment;

import java.util.Scanner;

class Matrix{
    int n;
    Matrix(int n){
        this.n=n;
    }
    int[][] initialize(int[][] arr){
        Scanner input=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("Enter the element of "+(i+1)+"th row and "+(j+1)+"th column: ");
                arr[i][j]=input.nextInt();
            }
        }
        return arr;
    }
    int[][] MatrixAdd(int[][] arr1, int[][] arr2){
        int[][] arr3=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        return arr3;
    }

    int[][] MatrixMult(int[][] arr1,int[][] arr2){
        int[][] arr3=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr3[i][j]=0;
                for(int k=0;k<n;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        return arr3;
    }
}

public class Assignment5_MatrixOperation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of both matrices: ");
        int n=input.nextInt();
        int[][] arr1 =new int[n][n];
        int[][] arr2 =new int[n][n];
        int[][] arr3 =new int[n][n];
        int[][] arr4 =new int[n][n];

        Matrix matrix1=new Matrix(n);
        Matrix matrix2=new Matrix(n);
        Matrix matrix3=new Matrix(n);

        System.out.println("Enter the elements of first matrix: ");
        arr1=matrix1.initialize(arr1);

        System.out.println("Enter the elements of second matrix: ");
        arr2=matrix2.initialize(arr2);

        arr3=matrix3.MatrixAdd(arr1,arr2);
        System.out.println("Addition of two matrices is=>");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

        arr4=matrix3.MatrixMult(arr1,arr2);
        System.out.println("Multiplication of two matrices is=>");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
