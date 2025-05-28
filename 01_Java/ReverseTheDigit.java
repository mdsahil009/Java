import java.util.Scanner;

public class ReverseTheDigit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ;
        System.out.println("=== Digit Reverse ===");
        System.out.print("Enter the digit to reverse : ");
        int num = input.nextInt();

        int revNum = reverse(num);
        System.out.println("After reverse the digit are : " + revNum);

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