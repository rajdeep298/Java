package rajdeep;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        //Vector is like the dynamic array which can grow or shrink its size. Unlike array, we can store n-number of elements in it as there is no size limit
        Vector v1=new Vector();//without generics
        Vector<String> v2=new Vector<String>();//with generics

        //add elements
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);

        v2.add("Rajdeep");
        v2.add("Rajdeep");
        v2.add("Rajdeep");
        v2.add("Rajdeep");

        //print elements
        System.out.println(v1);
        System.out.println(v2);

        //add element at specific index
        v1.add(2,5);
        v2.add(2,"Kundu");
        System.out.println(v1);
        System.out.println(v2);

        //update element
        v1.set(2,6);
        v2.set(2,"Hello");
        System.out.println(v1);
        System.out.println(v2);

        //remove element
        v1.remove(2);
        System.out.println(v1);

        //remove all elements
        v1.clear();
        System.out.println(v1);

        //remove element at specific index
        v2.remove(2);
        System.out.println(v2);

        //iterating vector
        for(String s:v2){
            System.out.println(s);
        }


    }
}
