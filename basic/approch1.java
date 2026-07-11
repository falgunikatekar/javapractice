import java.util.Scanner;
public class approch1 {
//nesting

    public static void main(String[] args) {
        //there is n+1 size array and 1to n no in array one no is extra find extra
        int[] array=new int[6];
        int count=0;
        for(int i=0;i<=5;i++){
            Scanner sc=new Scanner(System.in);
            array[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(array[i]==array[j]){
                    System.out.println("no is"+array[i]);
                    break;
                }
             
            }
        }
         
            
    }
}
