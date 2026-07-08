package sorting;

public class moveallzeroatend {
    public static void print(int[] arr){
        for(int element:arr){

            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,-1,3,0,52,63,0,73,0};
        int n=array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(array[j]==0){
                    int temp=array[j+1];
                    array[j+1]=array[j];array[j]=temp;
                }
            }
        }
        print(array);
    }
}
