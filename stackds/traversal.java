package stackds;
import java.util.Stack;
public class traversal {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(23);
        st.push(2389);
        st.push(89);
        int c=st.size();
        while(c!=0){
            System.out.println(st.pop());//top to bottom
            c-=1;
        }
    }
}
