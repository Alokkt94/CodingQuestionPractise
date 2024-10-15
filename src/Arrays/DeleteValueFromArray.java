package Arrays;

import java.util.Arrays;

public class DeleteValueFromArray {

    public static void main(String[] args) {
        int[] arr = new int[]{10,2,12,4,5,5};
        int removeElement = 12;
        deleteValue(arr ,removeElement);

    }

    private static void deleteValue(int[] arr, int removeElement) {
        for(int i = 0 ; i <arr.length ; i++){
                if(arr[i] == removeElement){
                    for(int j = i ; j< arr.length -1 ; j++){
                        arr[j] = arr[j + 1];
                    }
                }
            System.out.println(arr[i]);
        }
    }
}
