//Write a Java program to create a stack class of complex numbers. Where in stack class contains array of complex class.
package rajdeep.CC12_Assignment;

import java.util.Scanner;

class Complex1{
    int real,imaginary;

}
class ComplexStack{
    static int top=-1;
    Complex1[] arr=new Complex1[100];

    void push(Complex1 C1){
        if(top==99){
            System.out.println("Stack overflow");
        }
        else{
            top++;
            arr[top]=C1;
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Popped element is "+arr[top].real+"+("+arr[top].imaginary+")i");
            top--;
        }
    }

    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i].real+"+("+arr[i].imaginary+")i"+",");
        }
        System.out.println();
    }

}
public class Assignment7_StackComplex {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ComplexStack cs=new ComplexStack();
        while(true){
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            int choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter real part");
                    int real=input.nextInt();
                    System.out.println("Enter imaginary part");
                    int imaginary=input.nextInt();
                    Complex1 c1=new Complex1();
                    c1.real=real;
                    c1.imaginary=imaginary;
                    cs.push(c1);
                    break;
                case 2:
                    cs.pop();
                    break;
                case 3:
                    cs.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}
