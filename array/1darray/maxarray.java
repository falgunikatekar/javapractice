package array;
import java.util.Scanner;
public class maxarray {
    public static void main(String[] args) {
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextInt();
        }
        int max_=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max_){
                max_=arr[i];
            }
        }
        System.out.println("max element"+ max_);
    }
}
