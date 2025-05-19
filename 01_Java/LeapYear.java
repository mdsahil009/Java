import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check the given year is a Leap year or not : ");

        System.out.print("Enter the Year : ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )){
            System.out.println("This is a leap year : ");
        }else {
            System.out.println("This is not a leap year : ");
        }
    }
}