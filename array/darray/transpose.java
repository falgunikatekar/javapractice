package array.darray;

public class transpose {
    public static void main(String[] args) {
        int[][] array = {
                {2, 8, 1,3, 4},
                {7, 2, 1, 6, 3},
                {5, 5, 4, 1, 4},
                {3, 1, 8, 2, 6},
                {7, 12, 1, 6, 13}
        };
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){

                System.out.print(array[j][i] +" ");
            }
            System.out.println("");
        }

    }
}
