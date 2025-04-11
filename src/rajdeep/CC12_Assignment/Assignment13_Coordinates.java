package rajdeep.CC12_Assignment;

class  MyPoint{
    int x;
    int y;
    MyPoint(){
        x=0;
        y=0;
    }
    MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    int[] getXY(){
        int[] arr={x,y};
        return arr;
    }

    String toString1(){
        return "("+x+","+y+")";
    }

    double distance(int x,int y){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }
}
public class Assignment13_Coordinates {
    public static void main(String[] args) {
        MyPoint p = new MyPoint();
        System.out.println("Default coordinates are "+p.toString1());
        p.setXY(10,20);
        System.out.println("Coordinates after setting are "+p.toString1());
        System.out.println("Coordinates in array form are "+p.getXY()[0]+" "+p.getXY()[1]);
        System.out.println("Distance between (10,20) and (5,10) is "+p.distance(5,10));
    }

}
