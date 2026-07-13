package obj;

public class thiscons {

    public static class Student {

        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        Student s = new Student("Aal", 5);
    
        System.out.println(s.name);
        System.out.println(s.age);
    }
}