package Week_1;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args){
        String s = "()";
        System.out.println(isValid(s));  // Brute force approach
        System.out.println(isValid1(s));    // Optimal Solution using Stack
    }

    private static boolean isValid1(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else {
                if(st.isEmpty()) return false;
                if (ch==')' && st.peek()!='(') return false;
                if (ch==']' && st.peek()!='[') return false;
                if (ch=='}' && st.peek()!='{') return false;

                st.pop();
            }
        }
        return st.isEmpty();
    }

    private static boolean isValid(String s) {
        int length;

        do {
            length = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while(length != s.length());

        return s.length() == 0;
    }
}
