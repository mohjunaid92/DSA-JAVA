

public class moveAllZeros {
    public static void MoveZeros(int arr[]){
        int pivot = 0;
        for(int i = 0; i< arr.length; i++){
            if( arr[i] != 0 ){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,12,0,0};
        MoveZeros(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
