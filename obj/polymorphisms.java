package obj;


public class polymorphisms {
    public static class student{
        void speak(){
            System.out.println("rubbish");
        }
    }
    public static class human{
        void speak(){
            System.out.println("knowlendege");
    }}
    public static class childeren{
        void speak(){
            System.out.println("mummer");}
    }
    public static class monkey{
        void speak(){
            System.out.println("caou");}
    }
    public static class dog{
        void speak(){
        System.out.println("bark");}
    }

    public static void main(String[] args) {
        student s=new student();
        childeren ch=new childeren();
        monkey m = new monkey();
        dog d = new dog();
        s.speak();
        
        ch.speak();
        m.speak();
        d.speak();
    }
}
