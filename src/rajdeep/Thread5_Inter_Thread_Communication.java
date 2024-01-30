package rajdeep;

class Customer{
    private int amount=10000;
    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw...");
        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposit...");
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }
        this.amount-=amount;
        System.out.println("Withdraw completed...");
    }

    synchronized void deposit(int amount){
        System.out.println("Going to deposit...");
        this.amount+=amount;
        System.out.println("Deposit completed...");
        notify();
    }
}
public class Thread5_Inter_Thread_Communication {
    public static void main(String[] args) {
        final Customer c=new Customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(10000);
            }
        }.start();
    }
}
