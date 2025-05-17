import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number : ");
        int secNum = input.nextInt();
        int sum = firstNum + secNum;
        System.out.println("sum is :" + sum);
    }
}
