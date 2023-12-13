package rajdeep;

public class Variable_Length_Parameters {
    public int add(int ...arr) {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Variable_Length_Parameters v=new Variable_Length_Parameters();
        System.out.println(v.add(1,2,3,4,5,6,7,8,9,10));
    }
}
