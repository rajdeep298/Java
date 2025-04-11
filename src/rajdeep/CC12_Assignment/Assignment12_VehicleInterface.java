package rajdeep.CC12_Assignment;

interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
}

class JeskoAbsolut implements Vehicle{
    int speed;
    int gear;
    JeskoAbsolut(int speed, int gear){
        this.speed=speed;
        this.gear=gear;
    }
    public void changeGear(int a){
        gear=a;
        System.out.println("Gear changed to "+gear);
    }
    public void speedUp(int a){
        speed=speed+a;
        System.out.println("Speed increased to "+speed+"km/h");
    }
    void print(){
        System.out.println("Jesko Absolut: Speed: "+speed+"km/h"+" Gear: "+gear);
    }
}

class AgeraRS implements Vehicle{
    int speed;
    int gear;
    AgeraRS(int speed, int gear){
        this.speed=speed;
        this.gear=gear;
    }
    public void changeGear(int a){
        gear=a;
        System.out.println("Gear changed to "+gear);
    }
    public void speedUp(int a){
        speed=speed+a;
        System.out.println("Speed increased to "+speed+"km/h");
    }
    void print(){
        System.out.println("Agera RS: Speed: "+speed+"km/h"+" Gear: "+gear);
    }
}
public class Assignment12_VehicleInterface {
    public static void main(String[] args) {
        JeskoAbsolut j = new JeskoAbsolut(480,7);
        j.print();
        j.changeGear(9);
        j.speedUp(70);
        j.print();

        AgeraRS a = new AgeraRS(400,8);
        a.print();
        a.changeGear(9);
        a.speedUp(47);
        a.print();
    }
}
