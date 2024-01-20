package rajdeep.CC12_Assignment;

public class Assignment17_VowelException extends Exception {
    Assignment17_VowelException(String s) {
        super(s);
    }

    public static void main(String[] args) {
        String str = "Brght, crsp wntr wnds whstl crclng drftng flcks.";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        try {
            if (count == 0) {
                throw new Assignment17_VowelException("No vowels found");
            }
        } catch (Assignment17_VowelException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
