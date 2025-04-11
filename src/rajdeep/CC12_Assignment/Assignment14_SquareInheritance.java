package rajdeep.CC12_Assignment;

class Square{
    double side;
    Square(double side){
        this.side=side;
    }
    void getVolume(){
        System.out.println("Volume of square is "+side*side);
    }
}


class Cylinder extends Square{
    double height;
    Cylinder(double side,double height){
        super(side);
        this.height=height;
    }
    void getVolume(){
        double radius=super.side;
        System.out.println("Volume of cylinder is "+3.14*radius*radius*height);
    }
}
public class Assignment14_SquareInheritance {
    public static void main(String[] args) {
        Square s = new Square(10);
        s.getVolume();
        Cylinder c = new Cylinder(10,20);
        c.getVolume();
    }
}
