package rajdeep;

public class Mutable_String_String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Rajdeep");
        System.out.println(sb);

        //append
        sb.append(" ");
        sb.append("Kundu");
        System.out.println(sb);

        //insert
        sb.insert(7,"Insertion");
        System.out.println(sb);

        //replace
        sb.replace(7,17,"Replacement");
        System.out.println(sb);

        //delete
        sb.delete(7,18);
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);

        //capacity
        System.out.println(sb.capacity());
        sb.append("Rajdeep Kundu");
        System.out.println(sb.capacity());//new capacity=(old capacity*2)+2

        //length
        System.out.println(sb.length());

        //deleteCharAt
        sb.deleteCharAt(0);
        System.out.println(sb);

        //setCharAt
        sb.setCharAt(0,'u');
        System.out.println(sb);

        //and many more
    }
}
