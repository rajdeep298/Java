package rajdeep;
import java.io.*;
public class Exception5_All_BuiltIn_Exceptions {
    public static void main(String[] args) {

        //ArithmeticException
        try{
            int a=10,b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        //NullPointerException
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }

        //NumberFormatException
        try{
            String s="abc";
            int i=Integer.parseInt(s);
            System.out.println(i);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }

        //StringIndexOutOfBoundsException
        try{
            String s="abc";
            System.out.println(s.charAt(3));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }

        //FileNotFoundException
        try{
            java.io.FileInputStream fis=new FileInputStream("abc.txt");
        }
        catch(java.io.FileNotFoundException e){
            System.out.println(e);
        }

        //ArrayIndexOutOfBoundsException
        try{
            int a[]=new int[5];
            a[10]=50;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        //ioException
        try{
            java.io.FileInputStream fis=new FileInputStream("abc.txt");
        }
        catch(java.io.IOException e){
            System.out.println(e);
        }

        // and many more...
    }
}
