package obj;

public class constructors {
    public static class student{
        String name;
        int age;
        
        student(String name,int age ){
            name="Dlf";
            age=45;
        }
    }
    
    public static void main(String[] args) {
        student s=new student ("aal",5);
        System.out.println(s.name);
    }
}
