package rajdeep;

import java.util.List;
import java.util.Vector;

public class Vector_Basics {
    public static void main(String[] args) {
        //In ArrayList, if we add an element and the size of the ArrayList is full, then a new ArrayList is created with double the size of the previous ArrayList and the elements of the previous ArrayList are copied to the new ArrayList.
        //This is a costly operation.
        //To avoid this, we use Vector.
        //Vector is similar to ArrayList but it is synchronized.
        //Synchoronized means that only one thread can access the Vector at a time. Unlike ArrayList, multiple threads can access the ArrayList at a time.
        //Vector is present in java.util package.
        //Vector is a legacy class.
        //Vector is thread-safe.
        //Vector is slow as compared to ArrayList. Due to synchronization, it is slow.
        //Vector is dynamic in nature. It can grow and shrink automatically.
        //Vector is heterogeneous. It can store any type of data.
        //Vector implements RandomAccess interface.

        // Vector
        List<Integer> vector=new Vector<Integer>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        System.out.println(vector);

        // Vector methods
        vector.add(2,25);
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(2));//get() method is used to get the element at a particular index.
        System.out.println(vector.size());//size() method is used to get the size of the vector.
        System.out.println(vector.contains(30));//contains() method is used to check if an element is present in the vector or not.
        System.out.println(vector.indexOf(30));//indexOf() method is used to get the index of an element.
        System.out.println(vector.isEmpty());//isEmpty() method is used to check if the vector is empty or not.
        vector.clear();//clear() method is used to clear the vector.

    }
}
