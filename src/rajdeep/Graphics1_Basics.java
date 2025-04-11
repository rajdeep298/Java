package rajdeep;
import java.awt.*;
import java.awt.event.*;

public class Graphics1_Basics extends Frame {
    public Graphics1_Basics(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }

        });
    }

    public void paint(Graphics g){
        //Draw Text
        //g.drawString(String str,int x,int y);
        g.drawString("Hello World",100,100);

        //Draw Line
        //g.drawLine(int x1,int y1,int x2,int y2);
        g.drawLine(20,40,100,90);

        //Draw Rectangle
        //g.drawRect(int x,int y,int width,int height);
        g.drawRect(20,150,60,50);

        //Draw Filled Rectangle
        //g.fillRect(int x,int y,int width,int height);
        g.fillRect(110,150,60,50);

        //Draw Rounded Rectangle
        //g.drawRoundRect(int x,int y,int width,int height,int arcWidth,int arcHeight);
        g.drawRoundRect(200,150,60,50,15,15);

        //Draw Filled Rounded Rectangle
        //g.fillRoundRect(int x,int y,int width,int height,int arcWidth,int arcHeight);
        g.fillRoundRect(290,150,60,50,15,15);

        //Draw Oval
        //g.drawOval(int x,int y,int width,int height);
        g.drawOval(20,250,50,50);//as height=width, it will draw a circle

        //Draw Filled Oval
        //g.fillOval(int x,int y,int width,int height);
        g.fillOval(110,250,75,50);

        //Draw Arc
        //g.drawArc(int x,int y,int width,int height,int startAngle,int arcAngle);
        g.drawArc(200,250,50,50,0,180);

        //Draw Filled Arc
        //g.fillArc(int x,int y,int width,int height,int startAngle,int arcAngle);
        g.fillArc(290,250,75,50,0,180);

        //Draw Polygon
        int[] xPoints={20,200,20,200,20};
        int[] yPoints={375,375,475,475,375};
        int nPoints=5;//number of points
        //g.drawPolygon(int[] xPoints,int[] yPoints,int nPoints);
        g.drawPolygon(xPoints,yPoints,nPoints);

        //Draw Filled Polygon
        int[] xPoints2={220,400,220,400,200};
        int[] yPoints2={475,475,575,575,475};
        int nPoints2=5;//number of points
        //g.fillPolygon(int[] xPoints,int[] yPoints,int nPoints);
        g.fillPolygon(xPoints2,yPoints2,nPoints2);
    }

    public static void main(String[] args) {
        Graphics1_Basics frame=new Graphics1_Basics();
        frame.setTitle("Graphics1_Basics");
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}
