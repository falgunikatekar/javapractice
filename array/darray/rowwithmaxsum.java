package array.darray;

public class rowwithmaxsum {
    public static void main(String[] args) {
        int[][] array={{3,4,5,1},{2,3,5,9},{5,8,5,15}};
        
        int max=0;
        for(int i=0;i<array.length;i++){
            int sum=0;
            for(int j=0;j<array[0].length;j++){
                sum+=array[i][j];
            }
            max=Math.max(sum, max);
        }
       
        System.out.println("max sum is"+max);
    }
}
