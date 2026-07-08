package string;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        System.out.println("Name: " + name);
    }
}