package Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int index = 0; // Index for placing non-zero elements
        int[] nums = new int[]{1,0,1,2,3,5};
        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the remaining positions with 0's
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}