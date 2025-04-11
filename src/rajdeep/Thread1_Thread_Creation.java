package rajdeep;

class Thread_Class extends Thread{ //Thread class is extended

    //overriding run() method of Thread class
    public void run(){
        System.out.println("Thread class is extended.");
    }

    Thread_Class(){
        super();
    }

    Thread_Class(String name){
        super(name);
        System.out.println("Thread name: "+this.getName());
    }

}

class Thread_Class2 implements Runnable{ //Runnable interface is implemented

    //overriding run() method of Runnable interface
    public void run(){
        System.out.println("Runnable interface is implemented.");
    }

}

public class Thread1_Thread_Creation{
    public static void main(String[] args) {

        //Types of constructors in Thread class
        Thread_Class t1=new Thread_Class(); //Thread() constructor
        t1.start();

        Thread_Class2 t2=new Thread_Class2(); //Thread(Runnable target) constructor
        Thread t=new Thread(t2);

        Thread_Class t3=new Thread_Class("Thread 3"); //Thread(String name) constructor

        Thread t4=new Thread(t2,"Thread 4"); //Thread(Runnable target,String name) constructor`

        //Methods of Thread class

        //getName()
        System.out.println("Thread name: "+t1.getName());

        //getId()
        System.out.println("Thread id: "+t1.getId());

        //getPriority()
        System.out.println("Thread priority: "+t1.getPriority());

        //getState()
        System.out.println("Thread state: "+t1.getState());

        //getClass()
        System.out.println("Thread class: "+t1.getClass());

        //isAlive()
        System.out.println("Thread is alive: "+t1.isAlive());

        //isDaemon()
        System.out.println("Thread is daemon: "+t1.isDaemon());
        //Daemon threads are low priority threads which runs in background to perform tasks such as garbage collection.

        //isInterrupted()
        System.out.println("Thread is interrupted: "+t1.isInterrupted());

        //activeCount()
        System.out.println("Active thread count: "+Thread.activeCount());
        //and many more...
    }
}
