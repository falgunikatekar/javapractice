package sorting;
//adjustment swapg if greater and largest element at the last of array after every swap

public class bubblesort {
    public static void print(int[] array){
    for(int elem:array){
        System.out.print(elem+" ");
    }
}
    public static void main(String[] args) {
        int[] arr={5,-2,3,-9,6,7,0};
        int n=arr.length;
        print(arr);
        System.out.println("sorted element is");
        for(int j=0;j<n-1;j++){
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int swap=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=swap;
            }
        }

        }
        
        print(arr);
    }
}
