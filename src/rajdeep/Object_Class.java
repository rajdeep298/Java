package rajdeep;

class Student{
    private int roll;
    private String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void print(){
        System.out.println("Roll=>"+roll);
        System.out.println("Name=>"+name);
    }
}

class Teacher{
    private int id;
    private String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


public class Object_Class {
    public static void main(String[] args) {
        Student s=new Student(1,"Rajdeep");
        s.print();

        //toString() method
        //it returns the string representation of the object as a string :classname of the object+@+hashcode
        System.out.println("To String:"+s.toString());


        //hashCode() method
        //it returns the hashcode number of an object
        System.out.println("HashCode:"+s.hashCode());

        //equals() method
        //it compares the given object with the current object
        System.out.println("Equals:"+s.equals(s));
        Teacher t=new Teacher(1,"Rajdeep");
        System.out.println("Equals:"+s.equals(t));


        //getClass() method
        //it returns the class of the object
        System.out.println("Get Class:"+s.getClass());


        //finalize() method
        //it is used to perform clean up processing just before the object is garbage collected
        //it is called by the garbage collector on an object when garbage collector determines that there are no more references to the object
        //in java, it is used to perform clean up processing before the object is garbage collected
    }
}
