package string;

public class buildin {
    public static void main(String[] args) {
        String s="falguni";
        String s1="falguni";
        String s2="fal";
        System.out.println(s.indexOf("s"));
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("fal"));//true
        System.out.println(s.startsWith("f"));
        System.out.println(s.endsWith("i"));
        System.out.println(s.compareTo(s2));
        System.out.println(s.concat(s1));
        System.out.println(s.substring(3));
        System.out.println(s.substring(0));
        System.out.println(s.equals(s2));
    

    }
}
