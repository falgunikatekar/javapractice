package array;

import java.util.ArrayList;

public class dynamicarray {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(13);
        arr.add(23);
        arr.add(33);
        arr.add(43);

        System.out.println(arr);
        System.out.println("arr[0]"+arr.get(2));
        arr.add(1,100);
        System.out.println("add at ingex 1");
        System.out.println(arr);
    }
}
