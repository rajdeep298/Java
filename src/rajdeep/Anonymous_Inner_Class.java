package rajdeep;

interface person{
    void eat();
}
public class Anonymous_Inner_Class {
    public static void main(String[] args) {

        //Anonymous Inner Class is a class without a name. It should be used if you have to override method of class or interface. Java Anonymous inner class can be created by two ways:
        //1. Class (maybe abstract or concrete).
        //2. Interface
        //Syntax:
        //class Outerclass{
        //    ...
        //    ...
        //    class AnonymousInnerClass{
        //        ...
        //    }
        //}
        //AnonymousInnerClass obj=new AnonymousInnerClass();
        //Anonymous Inner Class that extends a class
        //Here, we are overriding eat() method of person interface.

        person p=new person(){
            public void eat(){
                System.out.println("Eating");
            }
        };
        p.eat();
    }

}
