package rajdeep;

public class Thread2_Suspend_Resume extends Thread{
    public void run(){
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        Thread2_Suspend_Resume t1=new Thread2_Suspend_Resume();
        t1.start();

        //noinspection removal
        t1.suspend();
        System.out.println("Thread is suspended.");

        //noinspection removal
        t1.resume();
        System.out.println("Thread is resumed.");
    }
}
