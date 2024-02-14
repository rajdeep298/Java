package rajdeep;

public class String_Class {
    public static void main(String[] args) {
        //String is a sequence of characters.
        //In java, string is an object that represents a sequence of characters.
        //The java.lang.String class is used to create a string object.
        //String class is immutable, so that once it is created a String object cannot be changed. If we try to change the value of the string object, a new object is created.
        //String is a final class, so it cannot be inherited.
        //String class is present in java.lang package.
        //String class overrides the equals() method of Object class.
        //String class implements Serializable, Comparable and CharSequence interfaces.


        //String class methods
        //1. int length(): returns the length of the string.
        String s1="Rajdeep";
        System.out.println(s1.length());

        //2. String toLowerCase(): returns the string in lowercase letter.
        System.out.println(s1.toLowerCase());

        //3. String toUpperCase(): returns the string in uppercase letter.
        System.out.println(s1.toUpperCase());

        //4. String trim(): eliminates leading and trailing spaces.
        String s2=" Rajdeep ";
        System.out.println(s2.trim());

        //5. String startsWith(String prefix): checks if the string starts with the given prefix.
        System.out.println(s1.startsWith("R"));

        //6. String endsWith(String suffix): checks if the string ends with the given suffix.
        System.out.println(s1.endsWith("p"));

        //7. String charAt(int index): returns the character at the specified index.
        System.out.println(s1.charAt(3));

        //8. String valueOf(int i): returns the string representation of the integer argument.
        int a=10;
        System.out.println(String.valueOf(a));

        //9. String replace(char old, char new): replaces all occurrences of the specified char value.
        System.out.println(s1.replace('R', 'K'));

        //10. String substring(int beginIndex): returns the substring of the string.
        System.out.println(s1.substring(2));

        //11. String substring(int beginIndex, int endIndex): returns the substring of the string.
        System.out.println(s1.substring(2, 5));

        //12. String[] split(String regex): returns the array of strings after splitting the string.
        String s3="Rajdeep Kundu";
        String[] words=s3.split(" ");
        for(String w:words){
            System.out.println(w);
        }

        //13. boolean equals(Object obj): compares the string with the specified object.
        String s4="Rajdeep";
        System.out.println(s1.equals(s4));

        //14. int compareTo(String str): compares the string with the specified string.
        System.out.println(s1.compareTo(s4));

        //15. int indexOf(int ch): returns the index of the first occurrence of the specified character.
        System.out.println(s1.indexOf('j'));

        //16. int lastIndexOf(int ch): returns the index of the last occurrence of the specified character.
        System.out.println(s1.lastIndexOf('e'));

        //17. boolean contains(CharSequence s): returns true if the string contains the specified sequence of char values.
        System.out.println(s1.contains("Raj"));

        //18. boolean isEmpty(): returns true if the string is empty.
        System.out.println(s1.isEmpty());

        //19. String concat(String str): concatenates the specified string to the end of the string.
        System.out.println(s1.concat(" Kundu"));

        //20. char[] toCharArray(): converts the string to a character array.
        char[] ch=s1.toCharArray();
        for(char c:ch){
            System.out.println(c);
        }

        //21. static String format(String format, Object... args): returns a formatted string using the specified format and arguments.
        String s5=String.format("%d", 101);
        System.out.println(s5);

        //22. static String join(CharSequence delimiter, CharSequence... elements): returns a joined string.
        String s6=String.join("-", "Rajdeep", "Kundu");
        System.out.println(s6);

        //23. boolean matches(String regex): checks if the string matches the given regular expression.
        System.out.println(s1.matches("Rajdeep"));

        //24. byte[] getBytes(): encodes the string into a sequence of bytes using the platform's default charset.
        byte[] b=s1.getBytes();
        for(byte bt:b){
            System.out.println(bt);
        }

        //25. int hashCode(): returns the hash code of the string.
        System.out.println(s1.hashCode());
    }
}
