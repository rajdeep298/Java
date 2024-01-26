package rajdeep;

import java.util.ArrayList;
import java.util.List;


interface Operation {
    int op(int a, int b);
}

public class Lambda_Functions {
    public static void main(String[] args) {
        //Lambda Functions
        // are anonymous functions. They do not have a name.
        List<Integer> lst=new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        lst.add(60);
        lst.add(70);
        lst.add(80);
        lst.add(90);
        lst.add(100);

        // forEach() method is used to iterate over the elements of a collection.
        // forEach() method takes a lambda function as a parameter.
        lst.forEach(
                item-> System.out.println(item*item)
        );

        Operation s=(a, b)->a+b;
        System.out.println("Addition of 10 and 20 using Lambda functions: ");
        System.out.println(s.op(10,20));
        System.out.println("Subtraction of 10 and 20 using Lambda functions: ");
        Operation s1=(a, b)->a-b;
        System.out.println(s1.op(10,20));
        System.out.println("Multiplication of 10 and 20 using Lambda functions: ");
        Operation s2=(a, b)->a*b;
        System.out.println(s2.op(10,20));
        System.out.println("Division of 10 and 20 using Lambda functions: ");
        Operation s3=(a, b)->a/b;
        System.out.println(s3.op(10,20));
    }
}
