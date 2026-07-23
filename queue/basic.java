package queue;

import java.util.LinkedList;
import java.util.Queue;
public class basic {
    public static void main(String[] args) {
        Queue<Integer> qt=new LinkedList<>();
        qt.add(4);
        qt.add(5);
        qt.add(7);
        System.out.println(qt);

    }
}
