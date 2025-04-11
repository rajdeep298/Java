package rajdeep.CC12_Assignment;

import java.util.Scanner;
class Fibo{
    int a=0,b=1;
    Fibo(){
        System.out.print(a+",");
        System.out.print(b+",");
    }
    void print_fibo(int n){
        int c=0;
        for(int i=0;i<n-2;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}


public class Assignment2_Fibonacci  {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print: ");
        int n=input.nextInt();

        Fibo fib =new Fibo();
        fib.print_fibo(n);

    }
}
