import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = digitSum(num);
        System.out.println("Sum of digit : " + sum);
    }

    public static int digitSum(int num ){
        int Sum = 0 ;
        while (num > 0) {
            Sum = Sum + (num % 10);
            num = num/10;   
        }
        return Sum;    
    }
}
