package regression;

public class functioncallingitself {
    public static void main(String[] args) {
        falguni();
    }
    public static void falguni(){
        System.out.println("sarvesh");
        falguni();
    }
}
