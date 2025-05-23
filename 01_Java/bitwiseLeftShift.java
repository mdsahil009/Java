import java.util.Scanner;

public class bitwiseLeftShift {
    public static void main(String[]  args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bit wise Operation of LeftShift : ");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int result = num << 1;

        System.out.println("Bitwise LeftShift : " + result); 
}
}
