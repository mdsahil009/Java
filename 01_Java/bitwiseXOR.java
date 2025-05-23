import java.util.Scanner;

public class bitwiseXOR {
    public static void main(String[]  args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bit wise Operation of XOR : ");

        System.out.print("Enter the number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the another number : ");
        int num2  = input.nextInt();

        int sum = num1 ^ num2;
        System.out.print("Bitwise Operation of XOR : " + sum);
    }
    
}
