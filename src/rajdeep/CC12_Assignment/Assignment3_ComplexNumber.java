package rajdeep.CC12_Assignment;

import java.util.Scanner;

class Complex{
    int real,imaginary;
    Complex(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    Complex(){
        this.real=0;
        this.imaginary=0;
    }

    Complex add(Complex c1,Complex c2){
        Complex c3=new Complex();
        c3.real=c1.real+c2.real;
        c3.imaginary=c1.imaginary+c2.imaginary;
        return c3;
    }

    Complex multiplication(Complex c1,Complex c2){
        Complex c3=new Complex();
        c3.real=c1.real*c2.real-c1.imaginary*c2.imaginary;
        c3.imaginary=c1.imaginary*c2.real+c1.real*c2.imaginary;
        return c3;
    }
}

public class Assignment3_ComplexNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int real1=input.nextInt();
        int imaginary1=input.nextInt();
        int real2=input.nextInt();
        int imaginary2=input.nextInt();


        Complex c1=new Complex(real1,imaginary1);
        Complex c2=new Complex(real2,imaginary2);
        Complex c3=new Complex();
        Complex c4=new Complex();

        c3=c3.add(c1,c2);
        System.out.println("Addition=>"+c3.real+"+("+c3.imaginary+")i");
        c4=c4.multiplication(c1,c2);
        System.out.println("Multiplication=>"+c4.real+"+("+c4.imaginary+")i");
    }
}
