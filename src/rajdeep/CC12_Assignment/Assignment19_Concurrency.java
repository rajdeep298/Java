package rajdeep.CC12_Assignment;

class Base{
    int counter=0;
}

class Thread1 extends Base implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            counter++;
        }
    }
}
public class Assignment19_Concurrency {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1=new Thread1();
        Thread t2=new Thread(t1);
        Thread t3=new Thread(t1);
        t2.start();
        t3.start();
        try {
            //wait for t2 and t3 to finish
            t2.join();//join() method waits for the thread to die
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter: "+t1.counter);
    }
}
