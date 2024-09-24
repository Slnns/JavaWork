public class Main
{
    public static void main(String[] args){

        int[] arr = {2,5,0,3,4};
        int num = 6;
        int index = 2;
        int[] arr2 = ArrayHelper.addIndex(arr, index, num);
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}