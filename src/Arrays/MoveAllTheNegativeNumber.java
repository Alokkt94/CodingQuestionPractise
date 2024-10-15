package Arrays;

public class MoveAllTheNegativeNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,-3,-5,6,3,-2,-4,8};
        int[] result = sortArray(arr);
        for (int i: result) {
            System.out.println(i);
        }
    }

    private static int[] sortArray(int[] arr) {

        int j = 0, temp;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
}
