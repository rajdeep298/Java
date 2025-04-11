package rajdeep.LeetCode_Problems;

public class Square_Root {

    public int mySqrt(int x) {
        int a=1;
        int count=0;
        while(x>=a){
            x-=a;
            a+=2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Square_Root s=new Square_Root();
        System.out.println(s.mySqrt(8));
    }
}
