package rajdeep;

public class Exception3_MyException extends Exception {
    private static int acno[] = {1001, 1002, 1003, 1004, 1005};
    private static String name[] = {"Rajdeep", "Supradeep", "Swarnadeep", "Anirudha", "Ram"};
    private static double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

    Exception3_MyException() {}
    Exception3_MyException(String str) {
        super(str);
    }

    public static void main(String[] args) {
        try {
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

            for (int i = 0; i < 5; i++) {
                System.out.println("-------------------------------------------------");
                System.out.println(acno[i] + "\t" + name[i] + "\t" + bal[i]);

                if (bal[i] < 1000) {
                    Exception3_MyException me = new Exception3_MyException("Balance is less than 1000");
                    throw me;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception Occured: " + e);
        }
    }
}
