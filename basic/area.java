import java.util.Scanner;
public class area{
    public static void main(String[] agrs){
        //area=pi*r*r
 
        Scanner sc=new Scanner(System.in);
       
        System.out.print("enter radius ");
        int r=sc.nextInt();
        System.out.print(3.14*r*r);

    }
}