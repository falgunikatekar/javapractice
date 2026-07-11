package array;
import java.util.Scanner;
public class array_basic {
    public static void inputarr(int n){
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            int x =sc.nextInt();
            arr[i]=x;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,7};
        System.out.print(arr[0]+" "); 
        for (int i=0;i<=5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("enter");
        inputarr(5);
    }
}
