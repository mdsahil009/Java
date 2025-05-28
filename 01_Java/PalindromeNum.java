import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ;
        System.out.println("=== Palindrome Number ===");
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println(" Your number is Palindrome ");
        }else{
            System.out.println("your number is not Palindrome ");
        }

    }

    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }

    public static int reverse(int value) {
        int newNum = 0;
        while(value > 0){
            int digit = value % 10 ;
            newNum = newNum * 10 + digit;
            value = value/ 10;
        }   
        return newNum;             
    }
}
