package queue;
import java.util.Queue;
import java.util.LinkedList;

public class traversal {
    public static void main(String[] args) {
        Queue <Integer> q=new LinkedList<>();
        
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        q.add(110);
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.println(q.peek());
            int val=q.remove();
            q.add(val);

        }
    }
}
