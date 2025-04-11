package rajdeep;

class calculate {
    private int a, b;

    public calculate(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }
}
public class OOPS1_Addition {
    public static void main(String[] args) {
        calculate c = new calculate(10, 20);
        System.out.println(c.add());
    }
}
