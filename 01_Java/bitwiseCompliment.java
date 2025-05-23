import java.util.Scanner;

public class bitwiseCompliment {
    public static void main(String[]  args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bit wise Operation of Compliment : ");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int result = ~ num; 
        System.out.println("Bitwise Compliment : " + result); 
}
}