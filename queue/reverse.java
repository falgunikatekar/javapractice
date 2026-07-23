package queue;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class reverse {
    public static void main(String[] args) {
        Queue <Integer> q=new LinkedList<>();
        Stack <Integer> st=new Stack<>();
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        int n=q.size();
        while(n!=0){
            st.push(q.remove());
            n-=1;
        }
        n=st.size();
        while(n!=0){
            int val=st.pop();
            q.add(val);
            n-=1;
        }System.out.println(q);
        

    }
}