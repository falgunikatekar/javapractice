package obj;
import java.util.Scanner;
public class consofarray {
    public static class student{
        //array
        Scanner sc=new Scanner(System.in);
        int[] marks;
        String name;
        student(int s){
            marks=new int[s];
            for(int i=0;i<s;i++){
                marks[i]=sc.nextInt();
            }
            name="hello";
            System.out.println("name"+name);
            for(int i=0;i<s;i++){
                System.out.println("marks"+marks[i]);
            }
            
        }
    }
    public static void main(String[] args) {
        student s1=new student(4);
    }
}
