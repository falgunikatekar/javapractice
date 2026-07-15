package linkedlist;
import java.util.Scanner;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

public class userinput {

    static Scanner sc = new Scanner(System.in);

    public static int input() {
        System.out.print("Enter data: ");
        return sc.nextInt();
        
    }

    public static void main(String[] args) {

        int a = input();      // no object needed

        node n = new node(a);

        System.out.println("Data = " + n.data);
    }
}