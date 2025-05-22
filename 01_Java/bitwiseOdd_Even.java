import java.util.Scanner;

public class bitwiseOdd_Even {
    public static void main(String[]  args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bitwise Operation of checking num is odd or even  : ");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if ((num & 1) == 1 ) {
            System.out.println("Number is odd ");
        }else {
            System.out.println("Number is even");
        }
}
}