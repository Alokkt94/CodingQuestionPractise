package Arrays;

public class SortWithOutAlgorithm {

    public static void main(String[] args) {
        //Sort 0,1,2
        int[] arr = new int[]{0,0,2,2,1,0,2,1};

        int[] result = sortArray(arr , arr.length);
        System.out.println(result);
    }

    private static int[] sortArray(int[] array ,int length) {

        // Base case: If array size is 1, return
        if (length == 1) {
            return array;
        }

        // Traverse the array
        for (int i = 0; i < length - 1; i++) {
            // Swap if the element found is greater
            // than the next element
            if (array[i] > array[i + 1]) {
                array[i] = array[i] + array[i + 1];
                array[i + 1] = array[i] - array[i + 1];
                array[i] = array[i] - array[i + 1];
            }
        }

        // Largest element is fixed,
        // recur for remaining array
        sortArray(array, length - 1);

        return array;
    }
}
