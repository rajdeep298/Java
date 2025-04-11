package rajdeep.CC12_Assignment;

public class Assignment16_IndexArithmaticException {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            int a = 10, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
