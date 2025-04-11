package rajdeep;

public class Command_Line_Arguments {
    public static void main(String[] args) {
        int sum=0;
        for(int i = 0; i < args.length; i++) {
            sum+=Integer.parseInt(args[i]);
        }

////        or
//        for (String arg : args) {
//            sum += Integer.parseInt(arg);
//        }

        System.out.println(sum);

        //Output:java .\Command_Line_Arguments.java 1 2 3 4 5 6 7 8 9 10
        //       55
    }
}
