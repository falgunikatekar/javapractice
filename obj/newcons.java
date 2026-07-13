package obj;

public class newcons {
    public static class student{
        String name;
        int age;
        student(String name,int age){
            name="falguni";
            age=2;
            System.out.println("name "+ name +" age "+age);
        }
        student(){
            System.out.println("hi");
        }
    }
    public static void main(String[] args) {
        student s = new student("riya", 89);
        student s1=new student();
    }
}
