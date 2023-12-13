package rajdeep;

abstract class A{
    abstract void print();
    void show(){
        System.out.println("This is a normal method");
    }
}

class B extends A{
    void print(){
        System.out.println("This is a abstract method");
    }
}
public class Abstract_Classes {
    public static void main(String[] args) {
        B obj=new B();
        obj.print();
        obj.show();
    }
}
