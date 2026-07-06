package pattersns;

import java.util.Scanner;
public class sqalpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        // System.out.println("enter breadth");
        // int b=sc.nextInt();
        for (int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                System.out.print((char)(65 + j));

            }
            System.out.println();
        }
    }
    
}
