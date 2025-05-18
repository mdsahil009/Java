import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();

        System.out.println("For Sum :" + (a + b));
        System.out.println("For Subtract : " + (a - b));
        System.out.println("For Multiply : " + (a*b));
        System.out.println("For Divide : " + (a/b));
        System.out.println("For Modulo : " + (a%b));

    }
}