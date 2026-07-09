package string;

public class printAllSubstring {
    public static void main(String[] args) {
        String str ="gopi";
        for(int i=0;i<str.length()-1;i++){
            for(int j=i;j<str.length();j++){
                System.out.print(str.substring(i,j+1)+" ");
            }
        }
    }
}
