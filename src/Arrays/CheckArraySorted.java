package Arrays;

public class CheckArraySorted {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,0,4,5,6};

        boolean arrayIsSorted = true;
        for(int i = 0 ;i<arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                arrayIsSorted = false;
            }
        }

        if(arrayIsSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
