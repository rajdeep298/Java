package rajdeep;

interface x{
    void print();
    void show();
}

interface y{
    void print2();
    void show2();
}

interface z{
    void print3();
    void show3();
}

class w implements x,z,y{
    public void print(){
        System.out.println("This is a print method in class x.");
    }
    public void show(){
        System.out.println("This is a show method in class x.");
    }
    public void print2(){
        System.out.println("This is a print method in class y.");
    }
    public void show2(){
        System.out.println("This is a show method in class y.");
    }
    public void print3(){
        System.out.println("This is a print method in class z.");
    }
    public void show3(){
        System.out.println("This is a show method in class z.");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        w obj=new w();
        obj.print();
        obj.show();
        obj.print2();
        obj.show2();
        obj.print3();
        obj.show3();
    }
}
