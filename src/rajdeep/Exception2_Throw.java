package rajdeep;

import java.util.Scanner;

public class Exception2_Throw {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a=input.nextInt();
        int b=input.nextInt();

        if (b == 0) throw new ArithmeticException("Divide by zero error");
        else if(a<18) throw new ArithmeticException("Acess denied");
        else if(a>60) throw new ArithmeticException("Acess denied");
        else System.out.println("Result: "+(float)a/b);

        input.close();
    }
}
