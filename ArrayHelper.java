public class ArrayHelper {
    public static int[] add( int[]arr, int num){
        int size = arr.length;
        int[] arr2 = new int[size+1];
        for(int i = 0;i < size; i++){
            arr2[i] = arr[i];
        }
        arr2[size] = num;
        return arr2;
    }

    public static int[] addIndex(int[] arr, int index, int num){
        int size = arr.length;
        int[] arr2 = new int[size+1];
        for(int i = 0; i<index;i++){
            arr2[i] = arr[i];
        }
        arr2[index] = num;
        for(int i = index; i<size;i++){
            arr2[i+1] = arr[i];
        }
        return arr2;
    }
}
