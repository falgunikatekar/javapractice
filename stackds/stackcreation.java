package stackds;

import java.util.Stack;

public class stackcreation {
    public static void main(String[] args) {
        
    Stack <Integer> st= new Stack<>();
    st.push(23);
    st.push(2389);
    st.push(89);
    System.out.println(st.size());
    System.out.println(st);
    System.out.println(st.isEmpty());
    System.out.println(st.pop());
    System.out.println(st);

    }
}
