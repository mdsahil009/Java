import java.util.Scanner;

public class bitwiseRightShift {
    public static void main(String[]  args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bit wise Operation of addition : ");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int result = num >> 1; 
        System.out.println("Bitwise RightShift : " + result); 
}
}
