import java.util.Scanner;

public class oddSum {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the number you want to sum : ");
        int num = input.nextInt();
        int sum = oddsum(num);
        System.out.println("Sum till " + num + " is : " + sum);

    }

    public static int oddsum(int num){
         
        int odsum = 0;
        int i = 1; 
        while (i <= num) {
            odsum += i; 
            i += 2;
        }
        return odsum;
    }
}
