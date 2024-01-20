package rajdeep.CC12_Assignment;

class vowelException extends Exception {
    String str;
    vowelException(String str) {
        this.str = str;
    }
    void checkVowel() throws vowelException {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
        }
        if (count == 0) {
            throw new vowelException(str);
        }
    }
}
public class Assignment17_VowelException {

    public static void main(String[] args) {
        String str = "Brght, crsp wntr wnds whstl crclng drftng flcks.";
        try {
            vowelException ve = new vowelException(str);
            ve.checkVowel();
        } catch (vowelException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
