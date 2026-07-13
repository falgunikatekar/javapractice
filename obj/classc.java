package objectoritented;
import java.util.Scanner;
public class classc {
    
    public static class student{
        String name;
        int rollno;
        double cgpa;
        public void print(){
        System.out.println("name"+name +"rollno"+rollno+"cgpa"+cgpa);
    }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        student s=new student();
        s.name= sc.nextLine();
        s.rollno=34;
        s.cgpa=4.5;
        s.print();
        }
    }
