package stackds;

import java.util.Stack;

class n {

    public static boolean check(String str, Stack<Character> st) {

        for (int i = 0; i < str.length(); i++) {


            char ch = str.charAt(i);
       

            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            }

            else if (ch == ']' || ch == '}' || ch == ')') {

            
                if (st.isEmpty()) {
                    return false;
                }

                if (ch == ']') {

        

                    if (st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                }

                else if (ch == '}') {

                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }

                else {

    

                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }


        return st.isEmpty();
      
    }
}

public class parenthesischecking {

    public static void main(String[] args) {

        String str = "{([])}[]";

        Stack<Character> st = new Stack<>();

      
        System.out.println(n.check(str, st));
    
    }
}