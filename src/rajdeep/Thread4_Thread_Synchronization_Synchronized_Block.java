package rajdeep;

class Callme2{
    void call(String msg){
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller2 implements Runnable{
    String msg;
    Callme2 target;
    Thread t;
    public Caller2(Callme2 target, String msg){
        this.target=target;
        this.msg=msg;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (target){
            target.call(msg);
        }
    }
}
public class Thread4_Thread_Synchronization_Synchronized_Block {
    public static void main(String[] args) {
        Callme2 target2 = new Callme2();
        Caller2 obj1 = new Caller2(target2, "Hello");
        Caller2 obj2 = new Caller2(target2, "Synchronized");
        Caller2 obj3 = new Caller2(target2, "World");
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
