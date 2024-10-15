package Arrays;

public class AdditionOfTwoMatrices {

    public static void main(String[] args) {
        int[][] a = {{1,2},{4,5}};
        int[][] b = {{1,1},{1,1}};

        int[][] result = new int[a[0].length][a[1].length];

        for(int i = 0; i <= a[0].length ; i++){
            for(int j = 0 ; j<=b[0].length ;j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println(result);
    }
}
