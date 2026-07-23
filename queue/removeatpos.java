package queue;
import java.util.Queue;
import java.util.LinkedList;
public class removeatpos {
    public static void main(String[] args) {
        Queue <Integer> q=new LinkedList<>();
        int pos=2;
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        int n=q.size();
        for(int i=0;i<pos;i++){ 
            int val=q.remove();
            q.add(val);

        }  
        q.remove();
        for(int i=pos+1;i<n-pos+1;i++){
            int val=q.remove();
            q.add(val);
        }
        System.out.println(q);
    }
}
