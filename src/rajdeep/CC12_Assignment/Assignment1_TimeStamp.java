package rajdeep.CC12_Assignment;
import java.util.Scanner;

class Time{
    void setAndPrint(int hr,int min ,int sec){
        while(sec>=60){
            sec-=60;
            min++;
        }
        while(min >=60){
            min-=60;
            hr++;
        }
        System.out.println("Time is=>"+hr+":"+min+":"+sec);
    }
}

public class Assignment1_TimeStamp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Hour, Minute and Second");
        int hr=input.nextInt();
        int min=input.nextInt();
        int sec=input.nextInt();

        Time time=new Time();
        time.setAndPrint(hr,min,sec);

    }
}
