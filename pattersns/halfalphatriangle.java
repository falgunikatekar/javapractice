package pattersns;
import java.util.Scanner;
public class halfalphatriangle {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l = sc.nextInt();

        for(int i = 0; i<=l; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print((char)(65+j));
         }

        System.out.println();
      }
    }
}