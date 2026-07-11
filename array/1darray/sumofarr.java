package array;
import java.util.Scanner;
public class sumofarr {
    public static void main(String[] args) {
        int sum_=0;
        System.out.print("enter len");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("enter array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum_+=arr[i];
        } 
        System.out.println("sum is"+sum_);


    }
}
