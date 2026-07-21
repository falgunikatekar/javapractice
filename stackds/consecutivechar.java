package stackds;
import java.util.Stack;
public class consecutivechar {
    public static void main(String[] args) {
        String str="aabcad";
        Stack <Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
             char ch = str.charAt(i);
             if (st.isEmpty()) {
                st.push(ch);          // Push the first character
            }
            else if (ch != st.peek()) {
                st.push(ch);          // Push only if different from top
            }
        }System.out.println(st);
             

        }
       
    }