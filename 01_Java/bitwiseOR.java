import java.util.Scanner;

public class bitwiseOR {
    public static void main(String[]  args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bit wise Operation of OR : ");

        System.out.print("Enter the number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the another number : ");
        int num2  = input.nextInt();

        int sum = num1 | num2;
        System.out.print("Bitwise operation of OR : " + sum);
    }
    
}
