package rajdeep;

public class Type_Casting {
    public static void main(String[] args) {
        int a=10;
        double b=a; //implicit type casting
        System.out.println("Implicit type casting");
        System.out.println(b);

        double c=10.5;
        int d=(int)c; //explicit type casting
        System.out.println("Explicit type casting");
        System.out.println(d);
    }
}
