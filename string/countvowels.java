package string;
import java.util.Scanner;
public class countvowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String ch=sc.nextLine();
        int count=0;
        for (int i = 0; i < ch.length(); i++) {
            if(ch.charAt(i)=='a'||ch.charAt(i)=='e'||ch.charAt(i)=='i'||ch.charAt(i)=='o'||ch.charAt(i)=='u'){
                count+=1;
                
            }
            
        }
        System.out.println("count"+count);
    }
}
