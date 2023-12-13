package rajdeep;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        StringBuilder name1=new StringBuilder("Rajdeep");
        name1.append(" Kundu");
        name1.append(" Kundu");
        name1.append(" Kundu");
        name1.append(" Kundu");
        name1.append(" Kundu");
        name1.append(" Rajdeep");
        name1.append(" Rajdeep");
        name1.append(" Rajdeep");
        System.out.println(name1);
        System.out.println(name1.indexOf("Kundu"));
        System.out.println(name1.lastIndexOf("Kundu"));
        System.out.println(name1.indexOf("Rajdeep",10));
        System.out.println(name1.reverse());
    }
}
