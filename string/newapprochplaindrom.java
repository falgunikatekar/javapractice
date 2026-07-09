package string;
import java.util.Scanner;

public class newapprochplaindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        int n = str.length();
        boolean falg = true;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                falg = false;
                break;
            }
        }

        if (falg == true) {
            System.out.println("palindrom");
        } else {
            System.out.println("not");
        }
    }
}