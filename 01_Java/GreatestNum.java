import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check the Number is greatest : ");

        System.out.print("Enter the number A : ");
        float a = input.nextFloat();

        System.out.print("Enter the number B : ");
        float b = input.nextFloat();

        System.out.print("Enter the number C :  ");
        float c = input.nextFloat();

        if (a >= b && b >= c) {
            System.out.println("Greatest Number is A : " + a );
        }else if (b >= a && a >= c ){
            System.out.println("Greatest Number is B : " + b);
        }else {
            System.out.println("Greatest Number is C : " + c );
        }

    }
}