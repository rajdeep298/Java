package rajdeep.CC12_Assignment;
import java.util.Scanner;

class Complex {
    int real, imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imaginary = this.imaginary + c.imaginary;
        return result;
    }

    // Method to multiply two complex numbers
    Complex multiply(Complex c) {
        Complex result = new Complex();
        result.real = this.real * c.real - this.imaginary * c.imaginary;
        result.imaginary = this.imaginary * c.real + this.real * c.imaginary;
        return result;
    }

    // Method to get data from the user
    void getdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part: ");
        this.real = scanner.nextInt();
        System.out.print("Enter the imaginary part: ");
        this.imaginary = scanner.nextInt();
    }

    // Method to display complex number
    void showdata(String operation) {
        System.out.println(operation + " => " + this.real + " + (" + this.imaginary + ")i");
    }
}

public class Assignment3_ComplexNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter details for first complex number:");
        Complex c1 = new Complex();
        c1.getdata();

        System.out.println("Enter details for second complex number:");
        Complex c2 = new Complex();
        c2.getdata();

        // Addition
        Complex resultAdd = c1.add(c2);
        resultAdd.showdata("Addition");

        // Multiplication
        Complex resultMult = c1.multiply(c2);
        resultMult.showdata("Multiplication");
    }
}
