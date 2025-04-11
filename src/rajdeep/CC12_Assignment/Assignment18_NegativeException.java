package rajdeep.CC12_Assignment;

class NegativeException extends Exception {
    int arr[];
    NegativeException(int[] arr) {
        this.arr = arr;
    }
    void checkNegative() throws NegativeException {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                throw new NegativeException(arr);
            }
        }
    }
}
public class Assignment18_NegativeException {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, 5};
        try {
            NegativeException ne = new NegativeException(arr);
            ne.checkNegative();
        } catch (NegativeException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
