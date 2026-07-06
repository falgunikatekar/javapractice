import java.util.Scanner;
public class absolutevalue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("no is "+ num);
        }
        else{
            System.out.println("no is"+(-num));
        }
    }
}
