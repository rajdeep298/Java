package rajdeep;

public class Labelling_Loops {
    public static void main(String[] args) {
        int i,j;
        outer:for(i=0;i<5;i++){
            inner:for(j=0;j<5;j++){
                if(i==3){
                    break outer;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
