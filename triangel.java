import java.util.Scanner;
public class triangel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println("enter c");
        int c=sc.nextInt();
        if (a+b>c && b+a>c && a+c>b){
            System.out.println("triangle is possible");
        }
        else{
            System.out.println("triangel is not possible");
        }
    }
}
