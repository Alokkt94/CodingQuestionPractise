import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner numberObj = new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome");
        int enteredNumber = numberObj.nextInt();
        int modifiedNumber = 0;
        int n = enteredNumber;
        while(n >0){
            int result =   n % 10;
            modifiedNumber = (modifiedNumber * 10) + result;
            n = n /10;
        }
        if(modifiedNumber == enteredNumber){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}