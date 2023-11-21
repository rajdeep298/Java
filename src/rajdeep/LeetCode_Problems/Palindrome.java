package rajdeep.LeetCode_Problems;
public class Palindrome {
    public boolean isPalindrome(int x){
        String s=String.valueOf(x);
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        return s.equals(reverse);
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.isPalindrome(-121);

    }
}
