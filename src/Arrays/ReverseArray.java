package Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] resultArray = new int[arr.length];

        for(int i = 0 ; i< arr.length ; i++){
            resultArray[i] = arr[(arr.length -1)-i];
        }
        System.out.println(resultArray);
    }
}
