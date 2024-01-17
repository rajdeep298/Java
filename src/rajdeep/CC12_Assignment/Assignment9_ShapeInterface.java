package rajdeep.CC12_Assignment;

interface Shape{
    double getArea();
}
class rectangle implements Shape{
    double length;
    double breadth;
    rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double getArea(){
        return length*breadth;
    }
}
class circle implements Shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
class Triangle implements Shape{
    double base;
    double height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double getArea(){
        return 0.5*base*height;
    }
}
public class Assignment9_ShapeInterface {
    public static void main(String[] args) {
        rectangle r = new rectangle(10,20);
        System.out.println("Area of rectangle is "+r.getArea()+"sqare units");
        circle c = new circle(10);
        System.out.println("Area of circle is "+c.getArea()+"sqare units");
        Triangle t = new Triangle(10,20);
        System.out.println("Area of triangle is "+t.getArea()+"sqare units");
    }
}
