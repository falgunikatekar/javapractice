package stackds;
import java.util.Stack;
public class traversalbottomtotop {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        Stack <Integer> st1=new Stack<>();
        st.push(23);
        st.push(2389);
        st.push(89);
        int c=st.size();
        while(c!=0){
            int top=st.pop();
            st1.push(top);
            c-=1;
        }
        c = st1.size(); 
        while (c!=0) {
            System.out.println(st1.pop());
            c=c-1;            
        }

        }
    }

