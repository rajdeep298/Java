package rajdeep;
class Exception4_MyException2 extends Exception {
    private int detail;
    Exception4_MyException2(int a) {
        detail = a;
    }
    public String toString() {
        return "MyException[" + detail + "]";
    }
}
class Exception4_MyException2Demo {
    static void compute(int a) throws Exception4_MyException2 {
        System.out.println("Called compute(" + a + ")");
        if (a > 10)
            throw new Exception4_MyException2(a);
        System.out.println("Normal Exit");
    }
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (Exception4_MyException2 e) {
            System.out.println("Caught " + e);
        }
    }
}