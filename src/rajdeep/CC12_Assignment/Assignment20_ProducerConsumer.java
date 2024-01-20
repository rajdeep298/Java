package rajdeep.CC12_Assignment;

import java.util.ArrayList;

class Base20 {
    ArrayList<Integer> arr = new ArrayList<>();
    static int size = 5;

    synchronized void produce(int n) {
        while (arr.size() == size) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        arr.add(n);
        System.out.println("Produced: " + arr);
        notify();
    }

    synchronized void consume() {
        while (arr.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + arr.remove(0));
        System.out.println("Remaining: " + arr);
        notify();
    }
}

class Producer20 extends Thread {
    Base20 b;

    public Producer20(Base20 base) {
        this.b = base;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            b.produce(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer20 extends Thread {
    Base20 b;

    public Consumer20(Base20 base) {
        this.b = base;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            b.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Assignment20_ProducerConsumer {
    public static void main(String[] args) {
        Base20 sharedBase = new Base20();
        Producer20 p = new Producer20(sharedBase);
        Consumer20 c = new Consumer20(sharedBase);

        p.start();
        c.start();
    }
}
