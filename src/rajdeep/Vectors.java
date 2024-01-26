package rajdeep;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        //In ArrayList, if we add an element and the size of the ArrayList is full, then a new ArrayList is created with double the size of the previous ArrayList and the elements of the previous ArrayList are copied to the new ArrayList.
        //This is a costly operation.
        //To avoid this, we use Vector.
        //Vector is similar to ArrayList but it is synchronized.
        //Synchronized means that only one thread can access the Vector at a time. Unlike ArrayList, multiple threads can access the ArrayList at a time.
        //Vector is present in java.util package.
        //Vector is a legacy class.
        //Vector is thread-safe.
        //Vector is slow as compared to ArrayList. Due to synchronization, it is slow.
        //Vector is dynamic in nature. It can grow and shrink automatically.
        //Vector is heterogeneous. It can store any type of data.
        //Vector implements RandomAccess interface.
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

        //size of vector
        System.out.println(v2.size());

        //capacity of vector
        System.out.println(v2.capacity());

        //check if vector is empty
        System.out.println(v2.isEmpty());

        //check if vector contains an element
        System.out.println(v2.contains("Rajdeep"));

        //get element at specific index
        System.out.println(v2.get(2));

        //get index of an element
        System.out.println(v2.indexOf("Rajdeep"));

        //get last index of an element
        System.out.println(v2.lastIndexOf("Rajdeep"));

        //clone vector
        Vector<String> v3=new Vector<String>();
        v3=(Vector)v2.clone();
        System.out.println(v3);

        //convert vector to array
        String[] arr=new String[v2.size()];
        v2.copyInto(arr);
        for(String s:arr){
            System.out.println(s);
        }

        //convert vector to array
        Object[] arr1=v2.toArray();
        for(Object o:arr1){
            System.out.println(o);
        }

        //convert vector to string
        System.out.println(v2.toString());

    }
}
