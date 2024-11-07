package Arrays;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1,2,2,3};
        int num = numIdenticalPairs(arr);
        System.out.println(num);
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j<nums.length ; j++){
                if(nums[i] == nums[j] && i < j){
                    count ++;
                }
            }
        }
        return count;
    }
}
