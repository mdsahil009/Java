import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for Factorial : ");
        int num = input.nextInt();
        int sum = fact(num);
        System.out.println("Factorial Sum is : " + sum);
    }

    public static int fact(int num){
        if (num < 2 ) {
            return 1; 
        }
        int i = 2; 
        int factSum = 1;
        while (i <= num) {
            factSum = factSum * i;
            i ++;  
        }
        return factSum; 
    }
}
