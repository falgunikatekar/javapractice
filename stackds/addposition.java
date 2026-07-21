package stackds;

import java.util.Stack;
import java.util.Scanner;
public class addposition {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Stack <Integer> st= new Stack<>();
    Stack <Integer> st1= new Stack<>();
    int pos=2;
    st.push(23);
    st.push(2389);
    st.push(89);
    st.push(20);
    while(st.size()>pos+1){
        st1.push(st.pop());

    }
    System.out.println(st.peek());
    }
}
