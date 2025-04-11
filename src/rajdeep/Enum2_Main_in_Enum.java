package rajdeep;

public class Enum2_Main_in_Enum {
    enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;


        public static void main(String[] args) {
            Day d=Day.MONDAY;
            System.out.println(d);
        }
    }
}
