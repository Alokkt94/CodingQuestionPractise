package Arrays;

public class ConsecutiveValues {
    public static void main(String[] args) {
        int[] value =  new int[]{1,0,1,1,0,1};
        int valueToCheck = 1;
        int count = 0;
        int max_count = 0;
            for(int i = 0 ; i < value.length ; i++){
                if(valueToCheck != value[i]){
                    count=0;
                }else {
                    count++;
                }
                max_count = Math.max(max_count, count);
        }
        System.out.println(max_count);
    }
}
