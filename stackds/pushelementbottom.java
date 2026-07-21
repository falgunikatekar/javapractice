package stackds;
import java.util.Stack;


public class pushelementbottom {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(23);
        st.push(2389);
        st.push(89);
        Stack <Integer> st1=new Stack<>();
        int c=st.size();
        while(c!=0){
            int top=st.pop();
            st1.push(top);
            c-=1;

        }
        st.push(10);
        c=st1.size();
        while(c!=0){
            int ele=st1.pop();
            st.push(ele);
            c-=1;
        }
        System.out.println(st);
        System.out.println(st.peek());


    }


}
