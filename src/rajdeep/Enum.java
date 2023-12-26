package rajdeep;

enum Color{ //enums outside the class
    RED,
    GREEN,
    BLUE;
}

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

//enum with methods
enum Sub{
    BENGALI,
    ENGLISH,
    MATHS,
    PHYSICS,
    CHEMISTRY,
    BIOLOGY,
    COMPUTER_SCIENCE;

    private Sub(){
        System.out.println("Subject: "+this.toString());
    }

    public void subject(){
        System.out.println("Subject: "+this.toString());
    }
}
public class Enum {

    enum Animal{ //enums inside the class
        DOG,
        CAT,
        RAT;
    }

    Day d;
    Enum(Day d){
        this.d=d;
    }

    public void dayIsLike()
    {
        switch (d) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    public static void main(String[] args) {
        Color c1=Color.RED;
        System.out.println(c1);

        Animal a1=Animal.DOG;
        System.out.println(a1);

        //enum is public static final, so we can create main inside enum and as it is final it cant be inherited

        //using in switch case
        String str="MONDAY";
        Enum e1= new Enum(Day.valueOf(str));
        e1.dayIsLike();

        //looping through enum
        for (Day d1:Day.values()){
            System.out.println(d1);
        }

        //enum with methods
        Sub s1=Sub.BENGALI;
        System.out.println(s1);
        s1.subject();
    }
}
