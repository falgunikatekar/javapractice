import java.util.Scanner;
public class tell4digitornot {
    public static void main(String [] args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println(("enter no"));
        int num=sc.nextInt();
        if (num>0 ){
            int temp=num;
            while(temp > 0){
                count++;
                temp = temp / 10;
}
        }
        if(count==4){
            System.out.println("no is 4 digit");
        }
        else{
            System.out.println("no is not 4 digit");
        }

    }
    
}
