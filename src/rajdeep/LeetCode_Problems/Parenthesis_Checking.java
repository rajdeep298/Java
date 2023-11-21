package rajdeep.LeetCode_Problems;

public class Parenthesis_Checking {

    public boolean isValid(String s){
        char[] arr=new char[100];
        char[] arr2=new char[100];
        int index=0;
        int index2=0;
        int index3=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                arr[index++]=s.charAt(i);
            }
            else if(arr[index2]=='(' && s.charAt(i)==')'){
                arr2[index2++]=s.charAt(i);
                index3+=1;
            }
            else if(arr[index2]=='{' && s.charAt(i)=='}'){
                arr2[index2++]=s.charAt(i);
                index3+=1;
            }
            else if(arr[index2]=='[' && s.charAt(i)==']'){
                arr2[index2++]=s.charAt(i);
                index3+=1;
            }
            else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                arr2[index2++]=s.charAt(i);
            }
        }
        if(index==index2 &&index==index3) return true;
        else return false;
    }
    public static void main(String[] args) {
        String s="()[]{}";
        Parenthesis_Checking p=new Parenthesis_Checking();
        System.out.println(p.isValid(s));
    }
}
