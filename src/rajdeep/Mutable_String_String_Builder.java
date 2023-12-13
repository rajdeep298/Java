package rajdeep;

public class Mutable_String_String_Builder {
    public static void main(String[] args) {
        // String is immutable
        String name="Rajdeep";
        name.concat("Sarkar");

        // StringBuilder is mutable
        StringBuilder name1=new StringBuilder("Rajdeep");
        name1.append("Kundu");
        System.out.println(name1);

        //with capacity
        StringBuilder name2=new StringBuilder(10);
        name2.append("Hi ");
        name2.append("Rajdeep");
        System.out.println(name2);

        //delete
        StringBuilder name3=new StringBuilder("Rajdeep");
        name3.delete(1,3);
        System.out.println(name3);

        //index of substring
        System.out.println(name2.indexOf("Rajdeep"));

        //last occurence of substring
        StringBuilder name4=new StringBuilder("Rajdeep");
        name4.append("Rajdeep Hi Rajdeep Hi Hi");
        System.out.println(name4.lastIndexOf("Hi"));

        //index of a substring from a given index
        System.out.println(name4.indexOf("Hi",10));

        //reverse
        StringBuilder name5=new StringBuilder("Rajdeep");
        name5.reverse();
        System.out.println(name5);

        //and many more
    }
}
